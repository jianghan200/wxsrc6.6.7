package com.tencent.magicbrush.vulkan;

import com.tencent.magicbrush.a.b;

public class VulkanJniExport
{
  static
  {
    b.loadLibrary("mmvulkan");
  }
  
  public static native boolean isSupportVulkan();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/magicbrush/vulkan/VulkanJniExport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */