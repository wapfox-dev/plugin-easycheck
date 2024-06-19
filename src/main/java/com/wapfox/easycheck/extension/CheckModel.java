package com.wapfox.easycheck.extension;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import run.halo.app.extension.AbstractExtension;
import run.halo.app.extension.GVK;

/**
 * easycheck模型
 *
 * @author wapfox
 * @date 2024/6/19
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
@GVK(group = "easycheck.wapfox.com", kind = "EasyCheck", version = "v1alpha1", plural = "easychecks",
    singular = "easycheck")
public class CheckModel extends AbstractExtension {

}
