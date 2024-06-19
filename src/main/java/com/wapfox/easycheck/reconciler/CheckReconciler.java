package com.wapfox.easycheck.reconciler;

import run.halo.app.extension.ExtensionClient;
import run.halo.app.extension.controller.Controller;
import run.halo.app.extension.controller.ControllerBuilder;
import run.halo.app.extension.controller.Reconciler;

/**
 * 描述
 *
 * @author wapfox
 * @date 2024/6/19
 */
public class CheckReconciler implements Reconciler<Reconciler.Request> {

    private static final String FINALIZER_NAME = "check-protection";

    private final ExtensionClient client;

    public CheckReconciler(ExtensionClient client) {
        this.client = client;
    }

    @Override
    public Result reconcile(Request request) {
        return null;
    }

    @Override
    public Controller setupWith(ControllerBuilder controllerBuilder) {
        return null;
    }
}
