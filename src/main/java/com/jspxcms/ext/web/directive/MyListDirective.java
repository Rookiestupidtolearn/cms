package com.jspxcms.ext.web.directive;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

import java.io.IOException;
import java.util.Map;

public class MyListDirective extends AbstractMyListDirective implements TemplateDirectiveModel {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {
        super.doExecute(environment, map, templateModels, templateDirectiveBody, true);
    }
}
