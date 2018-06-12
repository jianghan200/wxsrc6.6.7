package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.d.a.a.a.b;
import com.tencent.d.a.a.a.d;
import com.tencent.d.a.c.i;
import com.tencent.d.b.e.c.a;
import com.tencent.d.b.e.f.a;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.Signature;
import java.security.SignatureException;
import junit.framework.Assert;

public final class h
  extends d
  implements a
{
  private int fdx = -1;
  String pIu = null;
  String vlV = null;
  private com.tencent.d.b.e.c vmD = null;
  com.tencent.d.b.e.f vmE = null;
  private WeakReference<Context> vmF = null;
  com.tencent.d.b.c.a vmG = null;
  com.tencent.d.b.c.b vmH = null;
  i vmI = null;
  private a vmJ = null;
  boolean vmK;
  boolean vmL;
  boolean vmM;
  
  public h(b paramb)
  {
    if ((Build.VERSION.SDK_INT < 23) && (Build.MANUFACTURER.equalsIgnoreCase("vivo")))
    {
      bool1 = true;
      this.vmK = bool1;
      if (Build.VERSION.SDK_INT >= 23) {
        break label121;
      }
    }
    label121:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.vmL = bool1;
      this.vmM = false;
      if (paramb != null) {
        break label126;
      }
      throw new IllegalArgumentException("param is null!");
      bool1 = false;
      break;
    }
    label126:
    this.fdx = paramb.fdx;
    this.vmD = paramb.vmi;
    this.vmE = paramb.vmj;
    this.vmF = new WeakReference(paramb.mContext);
    this.vmH = paramb.vmk;
    this.vmG = paramb.jgQ;
    this.pIu = paramb.pIu;
  }
  
  @SuppressLint({"NewApi"})
  final void a(Signature paramSignature)
  {
    if (this.vlZ)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: already finished. can not authenticate", new Object[0]);
      return;
    }
    Object localObject = (Context)this.vmF.get();
    if (localObject == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
      b(new com.tencent.d.b.a.a(17));
      return;
    }
    for (;;)
    {
      try
      {
        com.tencent.d.a.c.c.v("Soter.TaskAuthentication", "soter: performing start", new Object[0]);
        localObject = com.tencent.d.a.a.a.hB((Context)localObject);
        a.d locald = new a.d(paramSignature);
        if (this.vmG != null)
        {
          paramSignature = this.vmG.vlR;
          ((com.tencent.d.a.a.a)localObject).a(locald, paramSignature, this.vmJ);
          return;
        }
      }
      catch (Exception paramSignature)
      {
        localObject = paramSignature.getMessage();
        com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: caused exception when authenticating: %s", new Object[] { localObject });
        com.tencent.d.a.c.c.a("Soter.TaskAuthentication", paramSignature, "soter: caused exception when authenticating");
        b(new com.tencent.d.b.a.a(20, String.format("start authentication failed due to %s", new Object[] { localObject })));
        return;
      }
      paramSignature = null;
    }
  }
  
  public final void cFW()
  {
    com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: called from cancellation signal", new Object[0]);
    if (this.vmJ != null) {
      this.vmJ.aNH();
    }
  }
  
  @SuppressLint({"DefaultLocale", "NewApi"})
  final boolean cFX()
  {
    if (!com.tencent.d.b.b.a.cFO().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.a(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cFO().cFN())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.a(2));
      return true;
    }
    if (Build.VERSION.SDK_INT >= 16) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.vlV = ((String)com.tencent.d.b.b.a.cFO().cFQ().get(this.fdx, ""));
      if (!com.tencent.d.a.c.f.oW(this.vlV)) {
        break;
      }
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
      b(new com.tencent.d.b.a.a(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.fdx) })));
      return true;
    }
    if (!com.tencent.d.a.a.cFD())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: app secure key not exists. need re-generate", new Object[0]);
      b(new com.tencent.d.b.a.a(3));
      return true;
    }
    if ((!com.tencent.d.a.a.acz(this.vlV)) || (com.tencent.d.a.a.acB(this.vlV) == null))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: auth key %s not exists. need re-generate", new Object[] { this.vlV });
      b(new com.tencent.d.b.a.a(12, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[] { Integer.valueOf(this.fdx) })));
      return true;
    }
    if (!com.tencent.d.a.a.acA(this.vlV))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: auth key %s has already expired, and we've already deleted them. need re-generate", new Object[] { this.vlV });
      b(new com.tencent.d.b.a.a(11, String.format("the auth key to scene %d has already been expired. in Android versions above 6.0, a key would be expired when user enrolls a new fingerprint. please prepare the key again", new Object[] { Integer.valueOf(this.fdx) })));
      return true;
    }
    if ((this.vmD == null) && (com.tencent.d.a.c.f.oW(this.pIu)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: challenge wrapper is null!", new Object[0]);
      b(new com.tencent.d.b.a.a(16, "neither get challenge wrapper nor challenge str is found in request parameter"));
      return true;
    }
    Context localContext = (Context)this.vmF.get();
    if (localContext == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: context instance released in preExecute", new Object[0]);
      b(new com.tencent.d.b.a.a(17));
      return true;
    }
    if (!com.tencent.d.a.a.a.hB(localContext).hasEnrolledFingerprints())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: user has not enrolled any fingerprint in system.", new Object[0]);
      b(new com.tencent.d.b.a.a(18));
      return true;
    }
    if (com.tencent.d.a.a.hA(localContext))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: fingerprint sensor frozen", new Object[0]);
      b(new com.tencent.d.b.a.a(25, "Too many failed times"));
      return true;
    }
    if (this.vmG == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
      this.vmG = new com.tencent.d.b.c.a();
      return false;
    }
    if (this.vmE == null) {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
    }
    return false;
  }
  
  final void cFY()
  {
    if (this.vmG != null) {
      this.vmG.mR(true);
    }
  }
  
  final void cGc()
  {
    Signature localSignature = com.tencent.d.a.a.acC(this.vlV);
    if (localSignature == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: error occurred when init sign", new Object[0]);
      b(new com.tencent.d.b.a.a(13));
      return;
    }
    this.vmJ = new a(localSignature, (byte)0);
    a(localSignature);
    g.cGb().A(new h.2(this));
  }
  
  final void execute()
  {
    if (com.tencent.d.a.c.f.oW(this.pIu))
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
      this.vmD.bx(new c.a());
      this.vmD.a(new h.1(this));
      this.vmD.execute();
      return;
    }
    com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
    cGc();
  }
  
  public final boolean isCancelled()
  {
    return this.vmM;
  }
  
  private final class a
    extends a.b
  {
    Signature vmO = null;
    
    private a(Signature paramSignature)
    {
      this.vmO = paramSignature;
    }
    
    static String T(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        return "unknown error";
      }
      return paramCharSequence.toString();
    }
    
    @SuppressLint({"NewApi"})
    private void cGd()
    {
      if (h.this.vmL)
      {
        h.this.vmG.mR(false);
        h.this.vmM = true;
      }
    }
    
    public final void aNH()
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
      if (h.this.vmM)
      {
        com.tencent.d.a.c.c.v("Soter.TaskAuthentication", "soter: during ignore cancel period", new Object[0]);
        return;
      }
      super.aNH();
      g.cGb().A(new h.a.6(this));
      h.this.b(new com.tencent.d.b.a.a(24, "user cancelled authentication"));
      cGd();
    }
    
    public final void bFm()
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
      g.cGb().C(new Runnable()
      {
        public final void run()
        {
          if (!com.tencent.d.a.c.f.oW(h.this.pIu))
          {
            try
            {
              h.a.this.vmO.update(h.this.pIu.getBytes(Charset.forName("UTF-8")));
              h localh = h.this;
              Signature localSignature = h.a.this.vmO;
              try
              {
                localh.vmI = com.tencent.d.a.a.bP(localSignature.sign());
                if (localh.vmE != null)
                {
                  if (localh.vmI == null)
                  {
                    localh.b(new com.tencent.d.b.a.a(22, "sign failed even after user authenticated the key."));
                    return;
                  }
                  localh.vmE.bx(new f.a(localh.vmI.signature, localh.vmI.vlM, localh.vmI.vlL));
                  localh.vmE.a(new h.3(localh));
                  localh.vmE.execute();
                  return;
                }
              }
              catch (SignatureException localSignatureException2)
              {
                com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: sign failed due to exception: %s", new Object[] { localSignatureException2.getMessage() });
                com.tencent.d.a.c.c.a("Soter.TaskAuthentication", localSignatureException2, "soter: sign failed due to exception");
                localh.b(new com.tencent.d.b.a.a(22, "sign failed even after user authenticated the key."));
                return;
              }
              com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
            }
            catch (SignatureException localSignatureException1)
            {
              com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: exception in update", new Object[0]);
              com.tencent.d.a.c.c.a("Soter.TaskAuthentication", localSignatureException1, "soter: exception in update");
              com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: remove the auth key: %s", new Object[] { h.this.vlV });
              com.tencent.d.a.a.bD(h.this.vlV, false);
              h.a.this.onAuthenticationError(64536, "update signature failed");
              return;
            }
            localSignatureException1.b(new com.tencent.d.b.a.a(localSignatureException1.vmI));
            return;
          }
          com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: challenge is null. should not happen here", new Object[0]);
          h.a.this.onAuthenticationError(64536, "challenge is null");
        }
      });
      g.cGb().A(new Runnable()
      {
        public final void run()
        {
          if (h.this.vmH != null) {
            h.this.vmH.aNG();
          }
        }
      });
      cGd();
    }
    
    public final void onAuthenticationError(int paramInt, CharSequence paramCharSequence)
    {
      com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: on authentication fatal error: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
      if (paramInt != 10308)
      {
        g.cGb().A(new h.a.1(this, paramInt, paramCharSequence));
        h.this.b(new com.tencent.d.b.a.a(21, T(paramCharSequence)));
      }
      for (;;)
      {
        cGd();
        return;
        h.this.b(new com.tencent.d.b.a.a(25, T(paramCharSequence)));
      }
    }
    
    public final void onAuthenticationFailed()
    {
      super.onAuthenticationFailed();
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: authentication failed once", new Object[0]);
      g.cGb().A(new Runnable()
      {
        public final void run()
        {
          if (h.this.vmH != null) {
            h.this.vmH.onAuthenticationFailed();
          }
        }
      });
      if (h.this.vmK)
      {
        com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: should compat lower android version logic.", new Object[0]);
        h.this.vmG.mR(false);
        g.cGb().C(new h.a.7(this));
        g.cGb().l(new h.a.8(this), 1000L);
      }
    }
    
    public final void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
      g.cGb().A(new h.a.2(this, paramInt, paramCharSequence));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/d/b/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */