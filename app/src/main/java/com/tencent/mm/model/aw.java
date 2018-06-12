package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.w;

public final class aw
{
  public static SharedPreferences Ib()
  {
    SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("auth_info_key_prefs", 4);
    if (!localSharedPreferences.getBoolean("key_auth_info_prefs_created", false))
    {
      f.mDy.a(148L, 12L, 1L, true);
      Object localObject = new w(aa.duN + "autoauth.cfg");
      if ((!((w)localObject).sOk) && (((w)localObject).get(3) != null))
      {
        localEditor = localSharedPreferences.edit();
        localEditor.putBoolean("key_auth_info_prefs_created", true);
        localEditor.putInt("key_auth_update_version", ((Integer)((w)localObject).get(1)).intValue());
        localEditor.putInt("_auth_uin", ((Integer)((w)localObject).get(2)).intValue());
        localEditor.putString("_auth_key", (String)((w)localObject).get(3));
        localEditor.putString("server_id", (String)((w)localObject).get(4));
        x.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use autoauthcfg now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", new Object[] { Boolean.valueOf(localEditor.commit()), Boolean.valueOf(localSharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(localSharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(localSharedPreferences.getInt("_auth_uin", 0)), localSharedPreferences.getString("_auth_key", ""), localSharedPreferences.getString("server_id", "") });
        f.mDy.a(148L, 51L, 1L, true);
        return localSharedPreferences;
      }
      localObject = ad.getContext().getSharedPreferences("auto_auth_key_prefs", 4);
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      if (bi.oW(((SharedPreferences)localObject).getString("_auth_key", ""))) {
        break label504;
      }
      localEditor.putBoolean("key_auth_info_prefs_created", true);
      localEditor.putInt("key_auth_update_version", ((SharedPreferences)localObject).getInt("key_auth_update_version", 0));
      localEditor.putInt("_auth_uin", ((SharedPreferences)localObject).getInt("_auth_uin", 0));
      localEditor.putString("_auth_key", ((SharedPreferences)localObject).getString("_auth_key", ""));
      localEditor.putString("server_id", ad.getContext().getSharedPreferences("server_id_prefs", 4).getString("server_id", ""));
      x.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! use oldAAKsp now commit[%b] create[%b], ver[%d], uin[%d], aak[%s], sid[%s]", new Object[] { Boolean.valueOf(localEditor.commit()), Boolean.valueOf(localSharedPreferences.getBoolean("key_auth_info_prefs_created", false)), Integer.valueOf(localSharedPreferences.getInt("key_auth_update_version", 0)), Integer.valueOf(localSharedPreferences.getInt("_auth_uin", 0)), localSharedPreferences.getString("_auth_key", ""), localSharedPreferences.getString("server_id", "") });
    }
    for (;;)
    {
      return localSharedPreferences;
      label504:
      x.i("MicroMsg.MMReqRespAuthComm", "summerauth auth_info_key_prefs not exit! neither autoauthcfg nor oldAAKsp existed just install! stack[%s]", new Object[] { bi.cjd() });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */