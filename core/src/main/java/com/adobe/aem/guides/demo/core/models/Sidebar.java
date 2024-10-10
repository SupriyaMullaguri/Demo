package com.adobe.aem.guides.demo.core.models;


import javax.annotation.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Sidebar implements Name{
@ValueMapValue
    private String logopath;
    @ValueMapValue
    private String mobileimage;
    @ValueMapValue
    private String logolink;
    @ValueMapValue
    private boolean enableswitch;
    @ValueMapValue
    private String name;
    @ValueMapValue
    private String image;
    @ValueMapValue
    private String desktopicon;
    @ValueMapValue
    private String mobileicon;
    @ValueMapValue
    private String navigationurl;
    @ValueMapValue
    private String country;
    @Override
    public String getCountry() {
        // TODO Auto-generated method stub
        return country;
    }
    @Override
    public String getDesktopIcon() {
        // TODO Auto-generated method stub
        return desktopicon;
    }
    @Override
    public boolean getEnableSwitch() {
        // TODO Auto-generated method stub
        return enableswitch;
    }
    @Override
    public String getImage() {
        // TODO Auto-generated method stub
        return image;
    }
    @Override
    public String getLogoLink() {
        // TODO Auto-generated method stub
        return logolink;
    }
    @Override
    public String getLogoPath() {
        // TODO Auto-generated method stub
        return logopath;
    }
    @Override
    public String getMobileIcon() {
        // TODO Auto-generated method stub
        return mobileicon;
    }
    @Override
    public String getMobileImage() {
        // TODO Auto-generated method stub
        return mobileimage;
    }
    @Override
    public String getNavigationUrl() {
        // TODO Auto-generated method stub
        return navigationurl;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }




}