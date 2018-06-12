package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;

public final class b
  extends a
{
  private byte[] bjP;
  private byte[] pJR;
  private byte[] pJS;
  
  private void bSA()
  {
    File localFile3 = new File(com.tencent.mm.compatible.util.e.duO, "wear/key");
    if (!localFile3.exists()) {
      localFile3.mkdirs();
    }
    File localFile1 = new File(localFile3, "private.key");
    File localFile2 = new File(localFile3, "public.key");
    localFile3 = new File(localFile3, "session.key");
    if ((!localFile1.exists()) || (!localFile2.exists()) || (!localFile3.exists()))
    {
      x.i("MicroMsg.Wear.HttpAuthServer", "recreate keys");
      localFile1.delete();
      localFile2.delete();
      localFile3.delete();
      Object localObject1 = KeyPairGenerator.getInstance("RSA");
      ((KeyPairGenerator)localObject1).initialize(1024);
      Object localObject2 = ((KeyPairGenerator)localObject1).generateKeyPair();
      localObject1 = (RSAPublicKey)((KeyPair)localObject2).getPublic();
      RSAPrivateKey localRSAPrivateKey = (RSAPrivateKey)((KeyPair)localObject2).getPrivate();
      localObject2 = new HashMap(2);
      ((HashMap)localObject2).put("RSAPublicKey", localObject1);
      ((HashMap)localObject2).put("RSAPrivateKey", localRSAPrivateKey);
      localObject1 = (RSAPrivateKey)((HashMap)localObject2).get("RSAPrivateKey");
      this.pJS = ((RSAPublicKey)((HashMap)localObject2).get("RSAPublicKey")).getEncoded();
      this.pJR = ((RSAPrivateKey)localObject1).getEncoded();
      this.bjP = com.tencent.mm.plugin.wear.a.a.bSC();
      com.tencent.mm.a.e.b(localFile1.getAbsolutePath(), this.pJR, this.pJR.length);
      com.tencent.mm.a.e.b(localFile2.getAbsolutePath(), this.pJS, this.pJS.length);
      com.tencent.mm.a.e.b(localFile3.getAbsolutePath(), this.bjP, this.bjP.length);
    }
    for (;;)
    {
      x.i("MicroMsg.Wear.HttpAuthServer", "publicKey=%s privateKey=%s sessionKey=%s", new Object[] { ac.t(this.pJS), ac.t(this.pJR), ac.t(this.bjP) });
      return;
      x.i("MicroMsg.Wear.HttpAuthServer", "use old keys");
      this.pJS = com.tencent.mm.a.e.f(localFile2.getAbsolutePath(), 0, Integer.MAX_VALUE);
      this.pJR = com.tencent.mm.a.e.f(localFile1.getAbsolutePath(), 0, Integer.MAX_VALUE);
      this.bjP = com.tencent.mm.a.e.f(localFile3.getAbsolutePath(), 0, Integer.MAX_VALUE);
    }
  }
  
  public final byte[] DE()
  {
    boolean bool3 = true;
    if ((this.pJS == null) || (this.pJR == null) || (this.bjP == null)) {
      x.i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
    }
    try
    {
      bSA();
      if (this.pJS != null)
      {
        bool1 = true;
        if (this.pJR == null) {
          break label119;
        }
        bool2 = true;
        if (this.bjP == null) {
          break label124;
        }
        x.i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        return this.bjP;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", localException, "loadAllKey", new Object[0]);
        continue;
        boolean bool1 = false;
        continue;
        label119:
        boolean bool2 = false;
        continue;
        label124:
        bool3 = false;
      }
    }
  }
  
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(10001));
    localArrayList.add(Integer.valueOf(10002));
    return localArrayList;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool3 = true;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return null;
      x.i("MicroMsg.Wear.HttpAuthServer", "request public key");
      if ((this.pJS == null) || (this.pJR == null) || (this.bjP == null)) {
        x.i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
      }
      try
      {
        bSA();
        if (this.pJS != null)
        {
          bool1 = true;
          if (this.pJR == null) {
            break label155;
          }
          bool2 = true;
          if (this.bjP == null) {
            break label161;
          }
          x.i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          return this.pJS;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", paramArrayOfByte, "loadAllKey", new Object[0]);
          continue;
          boolean bool1 = false;
          continue;
          label155:
          boolean bool2 = false;
          continue;
          label161:
          bool3 = false;
        }
      }
      try
      {
        Object localObject2 = new PKCS8EncodedKeySpec(this.pJR);
        Object localObject1 = KeyFactory.getInstance("RSA");
        localObject2 = ((KeyFactory)localObject1).generatePrivate((KeySpec)localObject2);
        localObject1 = Cipher.getInstance(((KeyFactory)localObject1).getAlgorithm());
        ((Cipher)localObject1).init(2, (Key)localObject2);
        paramArrayOfByte = ((Cipher)localObject1).doFinal(paramArrayOfByte);
        localObject1 = com.tencent.mm.plugin.wear.a.a.f(this.bjP, paramArrayOfByte);
        x.i("MicroMsg.Wear.HttpAuthServer", "funid %d, randomKey=%s", new Object[] { Integer.valueOf(paramInt), ac.t(paramArrayOfByte) });
        return (byte[])localObject1;
      }
      catch (Exception paramArrayOfByte)
      {
        x.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", paramArrayOfByte, "sessionKey resp error", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */