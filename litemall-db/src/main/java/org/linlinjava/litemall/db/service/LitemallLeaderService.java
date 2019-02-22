
package org.linlinjava.litemall.db.service;


import org.linlinjava.litemall.db.dao.*;
import org.linlinjava.litemall.db.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class LitemallLeaderService {

    @Resource
    private LitemallLeaderMapper leaderMapper;
    @Resource
    private LitemallLeaderUserMapper leaderUserMapper;
    @Resource
    private LitemallUserMapper userMapper;
    @Resource
    private LitemallRouteLeaderMapper routeLeaderMapper;

    /**
     * 查询leader，在LitemallLeader表和LitemallRouteLeader
     * 返回值为list类型
     *
     * @param store
     * @param leaderName
     * @return
     */
    public List<LitemallLeader> QueryLeader(String store, String leaderName) {
        LitemallLeaderExample example = new LitemallLeaderExample();
        LitemallLeaderExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(store)) {
            criteria.andStoreEqualTo(store);
        }
        if (!StringUtils.isEmpty(leaderName)) {
            criteria.andLeaderNameEqualTo(leaderName);
        }
        return leaderMapper.selectByExample(example);
    }

    /**
     * 通过路线id查询leader，litemallleader和litemallRouteLeader结合
     * 返回值为list类型
     *
     * @param routeId
     * @return
     */
    public List<LitemallLeader> QueryLeaderByRoute(String store,Integer routeId,String leaderName) {

        List<LitemallLeader> list = new ArrayList();

        LitemallRouteLeaderExample example = new LitemallRouteLeaderExample();
        LitemallRouteLeaderExample.Criteria criteria = example.createCriteria();
        example.or().andRouteIdEqualTo(routeId);
        List<LitemallRouteLeader> routeLeaderList = routeLeaderMapper.selectByExample(example);

        for (LitemallRouteLeader routeLeader : routeLeaderList) {
            int leaderId = routeLeader.getLeaderId();
            LitemallLeaderExample example1 = new LitemallLeaderExample();
            LitemallLeaderExample.Criteria criteria1 = example1.createCriteria();
            if (!StringUtils.isEmpty(store)){
                criteria1.andStoreEqualTo(store);
            }
            if (!StringUtils.isEmpty(leaderName)){
                criteria1.andLeaderNameEqualTo(leaderName);
            }
            LitemallLeader leader;
            leader = leaderMapper.selectByPrimaryKey(leaderId);
            list.add(leader);
        }
        return list;
    }

    /**
     * 更新leader，在LitemallLeader中
     *
     * @param leader
     * @return
     */
    public int updateById(LitemallLeader leader) {
        leader.setUpdateTime(LocalDateTime.now());
        return leaderMapper.updateByPrimaryKeySelective(leader);
    }

    /**
     * 删除leader，在LitemallLeader中
     * 返回值为数组类型
     *
     * @param leaderId
     */
    public int[] deleteById(Integer leaderId) {
        //删除leader表中的leader，逻辑删除
        int leaderDelete = leaderMapper.logicalDeleteByPrimaryKey(leaderId);
        //删除user和leader关系
        LitemallLeaderUserExample example = new LitemallLeaderUserExample();
        example.or().andLeaderIdEqualTo(leaderId).andDeletedEqualTo(0);
        int leaderUserDelete = leaderUserMapper.deleteByExample(example);
        return new int[]{leaderDelete, leaderUserDelete};
    }

    /**
     * 查询leaderId返回leader下面的用户
     * 在LitemallLeaderUser表下
     *
     * @param leaderId
     * @return
     */
    public List<LitemallUser> QueryUser(Integer leaderId) {
        LitemallLeaderUserExample example = new LitemallLeaderUserExample();
        example.or().andDeletedEqualTo(0).andLeaderIdEqualTo(leaderId);
        List<LitemallLeaderUser> litemallLeaderUsers = leaderUserMapper.selectByExample(example);

        Iterator<LitemallLeaderUser> ite = litemallLeaderUsers.iterator();
        List<LitemallUser> list = new ArrayList<>();
        while (ite.hasNext()) {
            LitemallUser user;
            user = userMapper.selectByPrimaryKey(ite.next().getUserId());
            list.add(user);
        }
        return list;
    }

    /**
     * 根据用户结算佣金，在LitemallLeader中
     * 返回值为int类型
     * 由于是按照PrimaryKey更新，更新方式和结果可能不同。但是所有更新语句的返回值都是“本次更新影响记录条数”，
     * 所以结果就是1 或者0，1更新了0表示更新失败或者目前值与更新目标相同
     *
     * @param leader
     * @return
     */
    public int accountMoney(LitemallLeader leader) {
        Float beforeAward = leader.getBeforeAward();
        Float afterAward = leader.getAfterAward() + beforeAward;
        leader.setAfterAward(afterAward);
        leader.setBeforeAward((float) 0);
        return leaderMapper.updateByPrimaryKeySelective(leader);
    }
}