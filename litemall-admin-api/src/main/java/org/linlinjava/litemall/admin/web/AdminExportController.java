package org.linlinjava.litemall.admin.web;

import com.github.pagehelper.util.StringUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.service.LitemallOrderGoodsService;
import org.linlinjava.litemall.db.service.LitemallOrderService;
import org.linlinjava.litemall.db.service.LitemallRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/export")
@Validated
public class AdminExportController {
    private final Log logger = LogFactory.getLog(AdminExportController.class);

    @Autowired
    private LitemallRouteService routeService;

    @Autowired
    private LitemallOrderService orderService;

    @Autowired
    private LitemallOrderGoodsService orderGoodsService;

    @RequiresPermissions("admin:export:list")
    @RequiresPermissionsDesc(menu={"线路管理", "配送管理"},button = "查询")
    @PostMapping("/list")
    public Object List(Integer id,
                       String routeName,
                       String leader){
        if(StringUtil.isEmpty(id.toString())&&StringUtil.isEmpty(routeName)&&StringUtil.isEmpty(leader))
            return ResponseUtil.badArgument();

    }
}
