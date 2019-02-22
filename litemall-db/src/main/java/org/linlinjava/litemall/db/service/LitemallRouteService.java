package org.linlinjava.litemall.db.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.linlinjava.litemall.db.dao.LitemallRouteLeaderMapper;
import org.linlinjava.litemall.db.dao.LitemallRouteMapper;
import org.linlinjava.litemall.db.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LitemallRouteService {
    @Resource
    private LitemallRouteMapper routeMapper;
    @Resource
    private LitemallRouteLeaderMapper routeLeaderMapper;

    public LitemallRoute findById(Integer routeId) {
        return routeMapper.selectByPrimaryKey(routeId);
    }

    /**
     * 获取某个路线上的所有用户
     *
     * @param routeId 路线Id
     * @return 包含此路线的所有用户的list
     */
    public List<LitemallRouteLeader> findLeaderById(Integer routeId) {
        LitemallRouteLeaderExample example = new LitemallRouteLeaderExample();
        example.or().andRouteIdEqualTo(routeId);
        return routeLeaderMapper.selectByExample(example);
    }

    /**
     * 条件查询route表中的数据
     *
     * @param routeName
     * @param sender
     * @param phone
     * @param page
     * @param size
     * @return 包含上述条件的list
     */
    public List<LitemallRoute> querySelective(String routeName, String sender, String phone, Integer page, Integer size) {
        LitemallRouteExample example = new LitemallRouteExample();
        LitemallRouteExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(routeName)) {
            criteria.andRouteNameEqualTo(routeName);
        }
        if (!StringUtils.isEmpty(sender)) {
            criteria.andSenderEqualTo(sender);
        }
        if (!StringUtils.isEmpty(phone)) {
            criteria.andPhoneEqualTo(phone);
        }
        criteria.andDeletedEqualTo(false);
        PageHelper.startPage(page, size);
        return routeMapper.selectByExample(example);
    }

    public int countSelective(String routeName, String sender, String phone, Integer page, Integer size) {
        LitemallRouteExample example = new LitemallRouteExample();
        LitemallRouteExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(routeName)) {
            criteria.andRouteNameEqualTo(routeName);
        }
        if (!StringUtils.isEmpty(sender)) {
            criteria.andSenderEqualTo(sender);
        }
        if (!StringUtils.isEmpty(phone)) {
            criteria.andPhoneEqualTo(phone);
        }
        criteria.andDeletedEqualTo(false);
        PageHelper.startPage(page, size);
        return (int) routeMapper.countByExample(example);
    }

    /**
     * 通过路线名查询路线
     *
     * @param routeName 路线名
     * @return 路线名为routeName的路线
     */
    public List<LitemallRoute> findByRouteName(String routeName) {
        LitemallRouteExample example = new LitemallRouteExample();
        example.or().andRouteNameEqualTo(routeName);
        return routeMapper.selectByExample(example);
    }

    /**
     * 通过司机查询路线
     *
     * @param sender 司机名
     * @return 司机名为sender的路线
     */
    public List<LitemallRoute> findBySender(String sender) {
        LitemallRouteExample example = new LitemallRouteExample();
        example.or().andSenderEqualTo(sender);
        return routeMapper.selectByExample(example);
    }

    /**
     * 通过电话获取路线
     *
     * @param phone 电话号码
     * @return 电话号码为phone的路线
     */
    public List<LitemallRoute> findByPhone(String phone) {
        LitemallRouteExample example = new LitemallRouteExample();
        example.or().andPhoneEqualTo(phone);
        return routeMapper.selectByExample(example);
    }

    /**
     * 通过Id逻辑删除route和route_leader表的记录
     *
     * @param routeId 路线的id
     * @return 两个表分别删除的记录数量
     */
    public int[] deleteById(Integer routeId) {
        int routeCount = routeMapper.logicalDeleteByPrimaryKey(routeId);
        LitemallRouteLeaderExample example = new LitemallRouteLeaderExample();
        example.or().andRouteIdEqualTo(routeId);
        int routeLeaderCount = routeLeaderMapper.logicalDeleteByExample(example);
        return new int[]{routeCount, routeLeaderCount};
    }

    /**
     * 返回前20条数据
     *
     * @return 返回的数据list
     */
    public List<LitemallRoute> findTop20() {
        LitemallRouteExample example = new LitemallRouteExample();
        example.or().andIdBetween(0, 21);
        return routeMapper.selectByExample(example);
    }

    /**
     * 更新route表
     *
     * @param route 需要更新的route的LitemallRoute对象
     * @return 上述两个表分别修改数据的条数
     */
    public int updateRouteById(LitemallRoute route) {
        LitemallRouteExample example1 = new LitemallRouteExample();
        example1.or().andIdEqualTo(route.getId());
        int routeCount = routeMapper.updateByExample(route, example1);
        return routeCount;
    }

    /**
     * 更新route_leader表
     *
     * @param routeLeader 需要更新的RouteLeader对象
     * @return 修改数据的数量
     */
    public int updateRouteLeaderByUserId(LitemallRouteLeader routeLeader) {
        LitemallRouteLeaderExample example = new LitemallRouteLeaderExample();
        example.or().andLeaderIdEqualTo(routeLeader.getLeaderId());
        return routeLeaderMapper.updateByExample(routeLeader, example);
    }

    /**
     * 在route_leader表中添加记录
     *
     * @param routeLeader routeLeader类
     * @return 插入数据的条数
     */
    public int addRouteLeader(LitemallRouteLeader routeLeader) {
        return routeLeaderMapper.insert(routeLeader);
    }

    /**
     * 向route表和route_leader表里插入数据
     *
     * @param route 需要插入的route的LitemallRoute对象
     * @return 修改数据的条数
     */
    public int add(LitemallRoute route) {
        return routeMapper.insert(route);
    }
}
