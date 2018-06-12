package com.tencent.mm.plugin.report.service;

import android.content.Context;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  private static String filePath = getAppFilePath() + "/kvcomm/exception/";
  private static Byte mEx = new Byte((byte)0);
  
  static
  {
    if (!e.cn(filePath)) {
      e.cr(filePath);
    }
  }
  
  private static int aH(byte[] paramArrayOfByte)
  {
    int i = 0;
    int k;
    int m;
    for (int j = 0;; j = ((m & 0xFF) << (3 - k) * 8) + j)
    {
      k = i;
      if (k >= 4) {
        break;
      }
      m = paramArrayOfByte[k];
      i = k + 1;
    }
    return j;
  }
  
  public static void b(int paramInt, String arg1, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!e.cn(filePath))
    {
      x.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, filepath:" + filePath + " not exist , logId:" + paramInt + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1);
      return;
    }
    x.i("MicroMsg.ReportManagerKvCheck", "saveKVcommData, logId:" + paramInt + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1);
    String str1 = brS();
    if ("MM".equals(str1))
    {
      x.e("MicroMsg.ReportManagerKvCheck", "error path, invalid processname:" + str1 + ", logId:" + paramInt + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1);
      return;
    }
    str1 = filePath + str1 + ".statictis";
    Object localObject = new c();
    ((c)localObject).mEk = paramInt;
    ((c)localObject).mEl = ???;
    ((c)localObject).mEd = paramBoolean2;
    ((c)localObject).mEm = paramBoolean1;
    try
    {
      localObject = ((c)localObject).toByteArray();
      if (localObject == null)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, null == temp.");
        return;
      }
    }
    catch (IOException ???)
    {
      x.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + ???.getMessage());
      return;
    }
    synchronized (mEx)
    {
      if (e.e(str1, vt(localObject.length)) != 0)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, write obj_len to file:" + str1 + " fail.");
        return;
      }
    }
    if (e.e(str2, (byte[])localObject) != 0) {
      x.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, write object to file:" + str2 + " fail.");
    }
  }
  
  public static void brR()
  {
    if (!e.cn(filePath))
    {
      x.w("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, filepath:" + filePath + " not exist.");
      return;
    }
    File[] arrayOfFile = new File(filePath).listFiles();
    if (arrayOfFile == null)
    {
      x.e("MicroMsg.ReportManagerKvCheck", "list file fail, filePath:" + filePath);
      return;
    }
    for (;;)
    {
      int j;
      String str;
      int i;
      synchronized (mEx)
      {
        int k = arrayOfFile.length;
        j = 0;
        if (j >= k) {
          break label886;
        }
        localObject2 = arrayOfFile[j];
        if (localObject2 == null)
        {
          x.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, file is null");
        }
        else
        {
          str = ((File)localObject2).getAbsolutePath();
          i = 0;
          int m = e.cm(str);
          x.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, filename:" + ((File)localObject2).getAbsolutePath() + ", filelenth:" + m);
          if (i >= m)
          {
            x.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, read to end, deletefile:" + str);
            e.deleteFile(str);
          }
        }
      }
      Object localObject2 = e.e(str, i, 4);
      if (localObject2 == null)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, get obj_len fail. delete file:" + str);
      }
      else
      {
        i += 4;
        int n = aH((byte[])localObject2);
        localObject2 = e.e(str, i, n);
        if (localObject2 == null)
        {
          x.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, get obj_data fail. delete file:" + str);
        }
        else
        {
          i += n;
          Object localObject3;
          if (str.contains(".statictis")) {
            localObject3 = new c();
          }
          for (;;)
          {
            boolean bool1;
            try
            {
              ((c)localObject3).aG((byte[])localObject2);
              n = ((c)localObject3).mEk;
              localObject2 = ((c)localObject3).mEl;
              bool1 = ((c)localObject3).mEd;
              boolean bool2 = ((c)localObject3).mEm;
              x.i("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, reportkvcomm, logid:" + n + ", value:" + (String)localObject2 + ", isReportNow:" + bool2 + ", isImportant" + bool1);
              h.mEJ.a(n, (String)localObject2, bool2, bool1);
              x.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, curLen:" + i);
            }
            catch (IOException localIOException1)
            {
              x.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport(kvcomm), IOException:" + localIOException1.getMessage());
            }
            break;
            if (str.contains(".monitor"))
            {
              localObject3 = new b();
              try
              {
                ((b)localObject3).aG(localIOException1);
                long l1 = ((b)localObject3).bzI;
                long l2 = ((b)localObject3).mEb;
                long l3 = ((b)localObject3).mEc;
                bool1 = ((b)localObject3).mEd;
                x.i("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, reportidkey, id:" + l1 + ", key:" + l2 + ", value:" + l3 + ", isImportant" + bool1);
                h.mEJ.a(l1, l2, l3, bool1);
              }
              catch (IOException localIOException2)
              {
                x.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport(idkey), IOException:" + localIOException2.getMessage());
              }
              break;
            }
            if (!str.contains(".group_monitor")) {
              break label860;
            }
            localObject3 = new a();
            try
            {
              ((a)localObject3).aG(localIOException2);
              ArrayList localArrayList = new ArrayList();
              bool1 = false;
              localObject3 = ((a)localObject3).mEa.iterator();
              while (((Iterator)localObject3).hasNext())
              {
                b localb = (b)((Iterator)localObject3).next();
                IDKey localIDKey = new IDKey(localb.bzI, localb.mEb, localb.mEc);
                bool1 = localb.mEd;
                localArrayList.add(localIDKey);
                x.i("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, idkeyGroupStat, id:" + localb.bzI + ", key:" + localb.mEb + ", value:" + localb.mEc + ", isImportant" + bool1);
              }
              h.mEJ.b(localArrayList, bool1);
            }
            catch (IOException localIOException3)
            {
              x.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport(idkey), IOException:" + localIOException3.getMessage());
            }
          }
          continue;
          label860:
          x.e("MicroMsg.ReportManagerKvCheck", "invalid filename:" + str);
          continue;
          label886:
          return;
          j += 1;
        }
      }
    }
  }
  
  private static String brS()
  {
    Object localObject = ad.getProcessName();
    if ((localObject == null) || (((String)localObject).length() == 0)) {
      return "MM";
    }
    localObject = ((String)localObject).split(":");
    if (localObject.length <= 1) {
      return "MM";
    }
    return localObject[1];
  }
  
  public static void d(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    x.i("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, id:" + paramInt1 + ", key:" + paramInt2 + ", value:" + paramInt3 + ", isImportant:" + paramBoolean);
    if (!e.cn(filePath))
    {
      x.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, filepath:" + filePath + " not exist , Id:" + paramInt1 + ", key:" + paramInt2 + ", value:" + paramInt3 + ", isImportant:" + paramBoolean);
      return;
    }
    String str1 = brS();
    if ("MM".equals(str1))
    {
      x.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + str1 + ", id:" + paramInt1 + ", key:" + paramInt2 + ", val:" + paramInt3 + ", isImportant:" + paramBoolean);
      return;
    }
    str1 = filePath + str1 + ".monitor";
    ??? = new b();
    ((b)???).bzI = paramInt1;
    ((b)???).mEb = paramInt2;
    ((b)???).mEc = paramInt3;
    ((b)???).mEd = paramBoolean;
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = ((b)???).toByteArray();
      if (arrayOfByte == null)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, null == temp.");
        return;
      }
    }
    catch (IOException localIOException)
    {
      x.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + localIOException.getMessage());
      return;
    }
    synchronized (mEx)
    {
      if (e.e(localIOException, vt(arrayOfByte.length)) != 0)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write obj_len to file:" + localIOException + " fail.");
        return;
      }
    }
    if (e.e(str2, arrayOfByte) != 0) {
      x.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write object to file:" + str2 + " fail.");
    }
    x.d("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, fileLength:" + e.cm(str2));
  }
  
  public static void d(ArrayList<IDKey> arg0, boolean paramBoolean)
  {
    Object localObject1 = ???.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (IDKey)((Iterator)localObject1).next();
      x.i("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, id:" + ((IDKey)localObject2).GetID() + ", key:" + ((IDKey)localObject2).GetKey() + ", value:" + ((IDKey)localObject2).GetValue() + ", isImportant:" + paramBoolean);
    }
    if (!e.cn(filePath))
    {
      x.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, filepath:" + filePath + " not exist ");
      return;
    }
    localObject1 = brS();
    if ("MM".equals(localObject1))
    {
      x.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + (String)localObject1);
      return;
    }
    localObject1 = filePath + (String)localObject1 + ".group_monitor";
    Object localObject2 = new a();
    ((a)localObject2).hbF = ???.size();
    ??? = ???.iterator();
    while (???.hasNext())
    {
      IDKey localIDKey = (IDKey)???.next();
      b localb = new b();
      localb.bzI = ((int)localIDKey.GetID());
      localb.mEb = ((int)localIDKey.GetKey());
      localb.mEc = ((int)localIDKey.GetValue());
      localb.mEd = paramBoolean;
      ((a)localObject2).mEa.add(localb);
    }
    try
    {
      localObject2 = ((a)localObject2).toByteArray();
      if (localObject2 == null)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, null == temp.");
        return;
      }
    }
    catch (IOException ???)
    {
      x.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, IOException, detail:" + ???.getMessage());
      return;
    }
    synchronized (mEx)
    {
      if (e.e((String)localObject1, vt(localObject2.length)) != 0)
      {
        x.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write obj_len to file:" + (String)localObject1 + " fail.");
        return;
      }
    }
    if (e.e(str, (byte[])localObject2) != 0) {
      x.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write object to file:" + str + " fail.");
    }
  }
  
  private static String getAppFilePath()
  {
    Object localObject = ad.getContext();
    if (localObject == null) {
      return null;
    }
    try
    {
      localObject = ((Context)localObject).getFilesDir();
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = ((File)localObject).toString();
      return (String)localObject;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ReportManagerKvCheck", localException.getMessage());
    }
    return null;
  }
  
  private static byte[] vt(int paramInt)
  {
    return new byte[] { (byte)(paramInt >> 24 & 0xFF), (byte)(paramInt >> 16 & 0xFF), (byte)(paramInt >> 8 & 0xFF), (byte)(paramInt & 0xFF) };
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */