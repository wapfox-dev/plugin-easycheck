package com.wapfox.easycheck;

import com.wapfox.easycheck.extension.CheckModel;
import org.springframework.stereotype.Component;
import run.halo.app.extension.SchemeManager;
import run.halo.app.plugin.BasePlugin;
import run.halo.app.plugin.PluginContext;

/**
 * @author wapfox
 * @url https://wapfox.com
 * @since 1.0.0
 */
@Component
public class EasyCheckPlugin extends BasePlugin {

    private final SchemeManager schemeManager;

    public EasyCheckPlugin(PluginContext pluginContext, SchemeManager schemeManager) {
        super(pluginContext);
        this.schemeManager = schemeManager;
    }

    @Override
    public void start() {
        schemeManager.register(CheckModel.class);
        System.out.println("轻链插件启动成功！");
    }

    @Override
    public void stop() {
        schemeManager.unregister(schemeManager.get(CheckModel.class));
        System.out.println("轻链插件停止！");
    }
}
