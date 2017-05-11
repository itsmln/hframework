package com.hframework.web.config.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;
import com.hframework.web.config.bean.pagetemplates.*;

/**
 * generated by hframework on 2016.
 */@XStreamAlias("pagetemplates")
public class PageTemplates   {

	@XStreamImplicit
    @XStreamAlias("pagetemplate")
	private List<Pagetemplate> pagetemplateList;

    public PageTemplates() {
    }
   
 	 	 
     public List<Pagetemplate> getPagetemplateList(){
     	return pagetemplateList;
     }

     public void setPagetemplateList(List<Pagetemplate> pagetemplateList){
     	this.pagetemplateList = pagetemplateList;
     }
	 
}