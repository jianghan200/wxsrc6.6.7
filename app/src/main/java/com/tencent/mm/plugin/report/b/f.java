package com.tencent.mm.plugin.report.b;

import com.tencent.mm.a.e;
import com.tencent.mm.a.p;
import com.tencent.mm.model.at;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class f
{
  public static boolean KF(String paramString)
  {
    File localFile = new File("/sdcard/cov.txt");
    if (!localFile.exists())
    {
      x.w("MicroMsg.NetSceneCodeCoverageReport", "codecoverage checkUpload dir never create ?");
      return false;
    }
    String str = at.dBv.I("login_user_name", "never_login_crash");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("#username=" + str);
    localStringBuffer.append("\n");
    localStringBuffer.append("#rev=" + d.REV);
    localStringBuffer.append("\n");
    localStringBuffer.append("#path=" + d.SVNPATH);
    localStringBuffer.append("\n");
    if (paramString.length() > 0)
    {
      localStringBuffer.append("#startrev=" + paramString);
      localStringBuffer.append("\n");
    }
    e.e(localFile.getAbsolutePath(), localStringBuffer.toString().getBytes());
    paramString = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
    paramString = p.b(localFile, false, "/sdcard/cov/cov_" + paramString + ".zip");
    if (paramString == null)
    {
      x.e("MicroMsg.NetSceneCodeCoverageReport", "zip file failed");
      return false;
    }
    localFile.delete();
    x.i("MicroMsg.NetSceneCodeCoverageReport", "code coverage try upload :" + str);
    ae.a(paramString, str, false, false, 10, 20004);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/report/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */