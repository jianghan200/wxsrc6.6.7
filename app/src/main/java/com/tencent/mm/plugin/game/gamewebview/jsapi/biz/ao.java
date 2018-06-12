package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Bundle;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ao
  extends a
{
  public static final int CTRL_BYTE = 301;
  public static final String NAME = "reportGamePageTime";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    String str1 = paramJSONObject.optString("reportId");
    boolean bool1 = bi.oV(paramJSONObject.optString("reportInstantly")).equals("1");
    boolean bool2 = bi.oV(paramJSONObject.optString("reportTimeBegin")).equals("1");
    String str2 = paramJSONObject.optString("reportFormatData");
    paramJSONObject = paramJSONObject.optString("reportTabsFormatData");
    if (bi.oW(str1))
    {
      x.e("MicroMsg.GameJsApiReportGamePageTime", "reportId is null or nil");
      paramd.E(paramInt, a.f("reportGamePageTime:fail_invalid_reportId", null));
    }
    if ((bi.oW(str2)) && (bi.oW(paramJSONObject)))
    {
      x.e("MicroMsg.GameJsApiReportGamePageTime", "reportFormatData && reportTabsFormatData is null or nil");
      paramd.E(paramInt, a.f("reportGamePageTime:fail_invalid_reportFormatData_reportTabsFormatData", null));
    }
    x.i("MicroMsg.GameJsApiReportGamePageTime", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { str1, Boolean.valueOf(bool1), Boolean.valueOf(bool2), str2, paramJSONObject });
    Bundle localBundle = new Bundle();
    localBundle.putString("game_page_report_id", str1);
    localBundle.putBoolean("game_page_report_instantly", bool1);
    localBundle.putBoolean("game_page_report_time_begin", bool2);
    localBundle.putString("game_page_report_format_data", str2);
    localBundle.putString("game_page_report_tabs_format_data", paramJSONObject);
    paramd.setGamePageReportData(localBundle);
    paramd.E(paramInt, a.f("reportGamePageTime:ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */