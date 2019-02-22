package org.linlinjava.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.linlinjava.litemall.core.util.RegexUtil;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.LitemallLeader;
import org.linlinjava.litemall.db.service.LitemallLeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.linlinjava.litemall.admin.util.AdminResponseCode.*;

@RestController
@RequestMapping("/admin/leader")
public class AdminLeaderController {

    @Autowired
    private LitemallLeaderService leaderService;

    private final Log logger = LogFactory.getLog(AdminLeaderController.class);

    @RequiresPermissions("admin:leader:list")
    @RequiresPermissionsDesc(menu = {"团长管理", "团长信息"}, button = "查询")
    @PostMapping("/list")
    public Object list(@RequestParam(defaultValue = "null") String store,
                       @RequestParam(defaultValue = "null") Integer routeId,
                       @RequestParam(defaultValue = "null") String leaderName) {
        List<LitemallLeader> list;
        if (StringUtils.isEmpty(routeId)) {
            list = leaderService.QueryLeaderByRoute(routeId);
        } else {
            list = leaderService.QueryLeader(store, leaderName);
        }
        return ResponseUtil.ok(list);
    }

    @RequiresPermissions("admin:leader:update")
    @RequiresPermissionsDesc(menu = {"团长管理", "团长信息"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody LitemallLeader leader) {
        Object error = validate(leader);
        if (error != null) {
            return error;
        }
        if (leaderService.updateById(leader) == 0) {
            return ResponseUtil.updatedDataFailed();
        }
        return ResponseUtil.ok(leader);
    }

    @RequiresPermissions("admin:leader:delete")
    @RequiresPermissionsDesc(menu = {"团长管理", "团长信息"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestParam Integer leaderId) {
        if (!StringUtils.isEmpty(leaderId)) {
            return ResponseUtil.badArgumentValue();
        }
        if (leaderService.deleteById(leaderId).length != 2) {
            return ResponseUtil.updatedDataFailed();
        }
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:leader:accout")
    @RequiresPermissionsDesc(menu = {"团长管理", "团长信息"}, button = "结算")
    @PostMapping("/accout")
    public Object accout(@RequestBody LitemallLeader leader) {
        Object error = validate(leader);
        if (error != null) {
            return error;
        }
        if (leaderService.accountMoney(leader) != 1) {
            return ResponseUtil.updatedDataFailed();
        }
        return ResponseUtil.ok();
    }

    /**
     * 校验
     *
     * @param leader
     * @return
     */
    private Object validate(LitemallLeader leader) {
        String username = leader.getLeaderName();
        if (StringUtils.isEmpty(leader)) {
            return ResponseUtil.badArgument();
        }
        if (!RegexUtil.isUsername(username)) {
            return ResponseUtil.fail(USER_INVALID_NAME, "团长名不符合规定");
        }
        String mobile = leader.getMobile();
        if (StringUtils.isEmpty(mobile)) {
            return ResponseUtil.badArgument();
        }
        if (!RegexUtil.isMobileExact(mobile)) {
            return ResponseUtil.fail(USER_INVALID_MOBILE, "团长手机号码格式不正确");
        }
        return null;
    }
}