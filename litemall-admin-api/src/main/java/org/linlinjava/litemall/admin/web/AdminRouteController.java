package org.linlinjava.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.domain.LitemallRoute;
import org.linlinjava.litemall.db.domain.LitemallRouteLeader;
import org.linlinjava.litemall.db.service.LitemallRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/admin/route")
@Validated
public class AdminRouteController {
    private final Log logger = LogFactory.getLog(AdminRouteController.class);

    @Autowired
    private LitemallRouteService routeService;

    @RequiresPermissions("admin:route:list")
    @RequiresPermissionsDesc(menu = {"线路管理", "线路信息"}, button = "查询")
    @PostMapping("/list")
    public Object list(Integer id,
                       @RequestParam(defaultValue = "null") String routeName,
                       @RequestParam(defaultValue = "null") String sender,
                       @RequestParam(defaultValue = "null") String phone,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit) {
        int count;
        Object route;
        if (id != null) {
            count = 1;
            route = routeService.findById(id);
        } else {
            route = routeService.querySelective(routeName, sender, phone, page, limit);
            count = routeService.countSelective(routeName, sender, phone, page, limit);
        }
        HashMap<String, Object> data = new HashMap<>();
        data.put("count", count);
        data.put("item", route);
        return ResponseUtil.ok(data);
    }

    @RequiresPermissions("admin:route:update")
    @RequiresPermissionsDesc(menu = {"线路管理", "线路信息"}, button = "修改")
    @PostMapping("/update")
    public Object update(@RequestParam("id") Integer id,
                         @RequestParam String routeName,
                         @RequestParam String sender,
                         @RequestParam String phone,
                         @RequestParam(defaultValue = "null") int[] leaders) {
        LitemallRoute route = new LitemallRoute();
        route.setId(id);
        route.setRouteName(routeName);
        route.setSender(sender);
        route.setPhone(phone);
        if (leaders != null) {
            for (int i : leaders) {
                LitemallRouteLeader routeLeader = new LitemallRouteLeader();
                routeLeader.setRouteId(id);
                routeLeader.setLeaderId(i);
                routeService.addRouteLeader(routeLeader);
            }
        }
        int count = routeService.updateRouteById(route);
        HashMap<String, Object> data = new HashMap<>();
        if (count > 0) {
            return ResponseUtil.ok();
        } else {
            return ResponseUtil.updatedDataFailed();
        }
    }

    @RequiresPermissions("admin:route:delete")
    @RequiresPermissionsDesc(menu = {"线路管理", "路线信息"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestParam("id") Integer id) {
        int count[] = routeService.deleteById(id);
        HashMap<String, Object> data = new HashMap<>();
        if (count != null) {
            return ResponseUtil.ok(count);
        } else {
            return ResponseUtil.updatedDataFailed();
        }
    }

    @RequiresPermissions("admin:route:put")
    @RequiresPermissionsDesc(menu = {"线路管理", "路线信息"}, button = "新增")
    @PostMapping("/put")
    public Object put(@RequestParam String routeName,
                      @RequestParam String sender,
                      @RequestParam String phone,
                      @RequestParam String[] user) {
        LitemallRoute route = new LitemallRoute();
        route.setRouteName(routeName);
        route.setSender(sender);
        route.setPhone(phone);
        HashMap<String, Object> data = new HashMap<>();
        int count = routeService.add(route);
        if (count <= 0) {
            return ResponseUtil.updatedDataFailed();
        } else {
            return ResponseUtil.ok(count);
        }
    }
}
