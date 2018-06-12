package com.tencent.mm.ab;

import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.request.b.a;
import oicq.wlogin_sdk.request.i;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.util;

public final class x
{
  private oicq.wlogin_sdk.request.b dKw = null;
  private long dKx = 0L;
  
  public x()
  {
    try
    {
      long l = bi.VF();
      this.dKw = new oicq.wlogin_sdk.request.b(ad.getContext(), com.tencent.mm.protocal.d.qVN);
      util.vKe = 1;
      util.vKf = new a();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WtloginMgr", "dkstart wtlogin init :%d", new Object[] { Long.valueOf(bi.bH(l)) });
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WtloginMgr", localException, "Failed initializing WtloginMgr.", new Object[0]);
    }
  }
  
  public final boolean a(long paramLong, byte[] paramArrayOfByte)
  {
    if (paramLong != this.dKx)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.dKx), Long.valueOf(paramLong) });
      return false;
    }
    if (bi.bC(paramArrayOfByte))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf respBuf is null.");
      return false;
    }
    label256:
    for (;;)
    {
      try
      {
        oicq.wlogin_sdk.request.b localb = this.dKw;
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
        {
          if (localb.vHQ == null)
          {
            break label256;
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf buflen:%d ret:%d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(i) });
            if (i != 0) {
              break;
            }
            return true;
          }
          util.adN("user:" + localb.vHK._uin + " ResolveSvrData ...");
          i = localb.vHQ.X(paramArrayOfByte, paramArrayOfByte.length);
          if (i == 1) {
            localb.hh(localb.vHK._uin);
          }
          util.adN("user:" + localb.vHK._uin + " ResolveSvrData ret=" + i);
          continue;
        }
        int i = 64519;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf e:%s", new Object[] { paramArrayOfByte.getMessage() });
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bi.i(paramArrayOfByte) });
        return false;
      }
    }
  }
  
  public final byte[] a(long paramLong, String paramString, boolean paramBoolean)
  {
    boolean bool;
    Object localObject;
    if (af.exm == 10006)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WtloginMgr", "dkwt isTestWtLogin:%b val:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(af.exn) });
      if (af.exm != 10006) {
        break label85;
      }
      if (af.exn != 1) {
        break label74;
      }
      af.exn = 0;
      localObject = new byte[0];
    }
    for (;;)
    {
      return (byte[])localObject;
      bool = false;
      break;
      label74:
      if (af.exn == 2) {
        return new byte[0];
      }
      try
      {
        label85:
        this.dKx = paramLong;
        byte[] arrayOfByte;
        if (paramBoolean)
        {
          arrayOfByte = null;
          label98:
          if (bi.bC(arrayOfByte)) {
            break label207;
          }
        }
        label207:
        for (bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf sig:%d uin:%d manualauth:%b  byA1Buf:%b ", new Object[] { Integer.valueOf(8256), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
          localObject = arrayOfByte;
          if (!bi.bC(arrayOfByte)) {
            break;
          }
          return this.dKw.a(paramLong, b.a.vHV, new String(bi.WP(paramString), "ISO-8859-1"));
          arrayOfByte = this.dKw.a(paramLong, b.a.vHW, "");
          break label98;
        }
        return new byte[0];
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf e:%s", new Object[] { paramString.getMessage() });
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bi.i(paramString) });
      }
    }
  }
  
  public final byte[] ba(long paramLong)
  {
    if (paramLong != this.dKx)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.dKx), Long.valueOf(paramLong) });
      return new byte[0];
    }
    try
    {
      byte[] arrayOfByte = this.dKw.hg(paramLong);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getVerifyImg e:%s", new Object[] { localException.getMessage() });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bi.i(localException) });
    }
    return new byte[0];
  }
  
  public final byte[] bb(long paramLong)
  {
    if (paramLong != this.dKx)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.dKx), Long.valueOf(paramLong) });
      return new byte[0];
    }
    try
    {
      WloginSigInfo localWloginSigInfo = this.dKw.vHK.hj(paramLong);
      WUserSigInfo localWUserSigInfo;
      if (localWloginSigInfo == null) {
        localWUserSigInfo = null;
      }
      while (localWUserSigInfo == null)
      {
        return new byte[0];
        localWUserSigInfo = new WUserSigInfo();
        localWUserSigInfo.get_clone(localWloginSigInfo);
      }
      arrayOfByte = localException._A2;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf e:%s", new Object[] { localException.getMessage() });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bi.i(localException) });
      return new byte[0];
    }
    byte[] arrayOfByte;
    return arrayOfByte;
  }
  
  public final void bc(long paramLong)
  {
    if (paramLong != this.dKx)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.dKx), Long.valueOf(paramLong) });
      return;
    }
    try
    {
      this.dKw.hh(paramLong);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo e:%s", new Object[] { localException.getMessage() });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bi.i(localException) });
    }
  }
  
  public final byte[] c(long paramLong, String paramString)
  {
    if (paramLong != this.dKx)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", new Object[] { Long.valueOf(this.dKx), Long.valueOf(paramLong) });
      return new byte[0];
    }
    if (bi.oW(paramString)) {}
    for (paramString = "****".getBytes();; paramString = paramString.getBytes()) {
      try
      {
        paramString = this.dKw.f(paramLong, paramString);
        return paramString;
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg e:%s", new Object[] { paramString.getMessage() });
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WtloginMgr", "exception:%s", new Object[] { bi.i(paramString) });
      }
    }
    return new byte[0];
  }
  
  final class a
    extends oicq.wlogin_sdk.tools.b
  {
    public a() {}
    
    public final void OnLog(int paramInt, String paramString1, String paramString2)
    {
      if (paramInt == 1) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
      }
      do
      {
        return;
        if (paramInt == 2)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
          return;
        }
      } while (paramInt != 0);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WtloginMgr.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
    }
    
    public final void s(int paramInt, String paramString)
    {
      OnLog(paramInt, "", paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */