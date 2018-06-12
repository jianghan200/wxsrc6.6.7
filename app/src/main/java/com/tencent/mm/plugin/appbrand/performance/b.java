package com.tencent.mm.plugin.appbrand.performance;

import android.util.SparseArray;
import com.tencent.mm.plugin.appbrand.s.j;

public final class b
{
  public static final int[] gpE = new int[4];
  public static final SparseArray<Integer> gpF = new SparseArray();
  
  static
  {
    gpE[0] = s.j.app_brand_performance_basic;
    gpE[1] = s.j.app_brand_performance_init;
    gpE[2] = s.j.app_brand_performance_render;
    gpE[3] = s.j.app_brand_performance_other;
    gpF.put(101, Integer.valueOf(s.j.app_brand_performance_cpu));
    gpF.put(102, Integer.valueOf(s.j.app_brand_performance_memory));
    gpF.put(103, Integer.valueOf(s.j.app_brand_performance_memory_delta));
    gpF.put(201, Integer.valueOf(s.j.app_brand_performance_download));
    gpF.put(202, Integer.valueOf(s.j.app_brand_performance_launching));
    gpF.put(203, Integer.valueOf(s.j.app_brand_performance_switch));
    gpF.put(301, Integer.valueOf(s.j.app_brand_performance_first_render));
    gpF.put(302, Integer.valueOf(s.j.app_brand_performance_re_render));
    gpF.put(303, Integer.valueOf(s.j.app_brand_performance_fps));
    gpF.put(401, Integer.valueOf(s.j.app_brand_performance_storage));
    gpF.put(402, Integer.valueOf(s.j.app_brand_performance_to_logic));
    gpF.put(403, Integer.valueOf(s.j.app_brand_performance_to_logic_data));
    gpF.put(404, Integer.valueOf(s.j.app_brand_performance_to_logic_native));
    gpF.put(405, Integer.valueOf(s.j.app_brand_performance_to_view));
    gpF.put(406, Integer.valueOf(s.j.app_brand_performance_to_view_data));
    gpF.put(407, Integer.valueOf(s.j.app_brand_performance_to_view_native));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/performance/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */