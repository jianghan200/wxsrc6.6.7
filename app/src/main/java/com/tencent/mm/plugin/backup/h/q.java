package com.tencent.mm.plugin.backup.h;

public final class q
  extends com.tencent.mm.bk.a
{
  public String hbQ;
  public String hck;
  public String hcl;
  public String hcm;
  public String hcn;
  public long hco;
  public long hcp;
  public String hcq;
  public String hcr;
  public com.tencent.mm.bk.b hcs;
  public com.tencent.mm.bk.b hct;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hck == null) {
        throw new f.a.a.b("Not all required fields were included: WeChatVersion");
      }
      if (this.hcl == null) {
        throw new f.a.a.b("Not all required fields were included: WeChatUserID");
      }
      if (this.hcm == null) {
        throw new f.a.a.b("Not all required fields were included: WeChatNickName");
      }
      if (this.hcn == null) {
        throw new f.a.a.b("Not all required fields were included: WeChatInstallDir");
      }
      if (this.hcq == null) {
        throw new f.a.a.b("Not all required fields were included: Manufacturer");
      }
      if (this.hbQ == null) {
        throw new f.a.a.b("Not all required fields were included: Model");
      }
      if (this.hcr == null) {
        throw new f.a.a.b("Not all required fields were included: Version");
      }
      if (this.hck != null) {
        paramVarArgs.g(1, this.hck);
      }
      if (this.hcl != null) {
        paramVarArgs.g(2, this.hcl);
      }
      if (this.hcm != null) {
        paramVarArgs.g(3, this.hcm);
      }
      if (this.hcn != null) {
        paramVarArgs.g(4, this.hcn);
      }
      paramVarArgs.T(5, this.hco);
      paramVarArgs.T(6, this.hcp);
      if (this.hcq != null) {
        paramVarArgs.g(7, this.hcq);
      }
      if (this.hbQ != null) {
        paramVarArgs.g(8, this.hbQ);
      }
      if (this.hcr != null) {
        paramVarArgs.g(9, this.hcr);
      }
      if (this.hcs != null) {
        paramVarArgs.b(10, this.hcs);
      }
      if (this.hct != null) {
        paramVarArgs.b(11, this.hct);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hck == null) {
        break label939;
      }
    }
    label939:
    for (int i = f.a.a.b.b.a.h(1, this.hck) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcl != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcl);
      }
      i = paramInt;
      if (this.hcm != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hcm);
      }
      paramInt = i;
      if (this.hcn != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hcn);
      }
      i = paramInt + f.a.a.a.S(5, this.hco) + f.a.a.a.S(6, this.hcp);
      paramInt = i;
      if (this.hcq != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.hcq);
      }
      i = paramInt;
      if (this.hbQ != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.hbQ);
      }
      paramInt = i;
      if (this.hcr != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.hcr);
      }
      i = paramInt;
      if (this.hcs != null) {
        i = paramInt + f.a.a.a.a(10, this.hcs);
      }
      paramInt = i;
      if (this.hct != null) {
        paramInt = i + f.a.a.a.a(11, this.hct);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hck == null) {
          throw new f.a.a.b("Not all required fields were included: WeChatVersion");
        }
        if (this.hcl == null) {
          throw new f.a.a.b("Not all required fields were included: WeChatUserID");
        }
        if (this.hcm == null) {
          throw new f.a.a.b("Not all required fields were included: WeChatNickName");
        }
        if (this.hcn == null) {
          throw new f.a.a.b("Not all required fields were included: WeChatInstallDir");
        }
        if (this.hcq == null) {
          throw new f.a.a.b("Not all required fields were included: Manufacturer");
        }
        if (this.hbQ == null) {
          throw new f.a.a.b("Not all required fields were included: Model");
        }
        if (this.hcr != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: Version");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        q localq = (q)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localq.hck = locala.vHC.readString();
          return 0;
        case 2: 
          localq.hcl = locala.vHC.readString();
          return 0;
        case 3: 
          localq.hcm = locala.vHC.readString();
          return 0;
        case 4: 
          localq.hcn = locala.vHC.readString();
          return 0;
        case 5: 
          localq.hco = locala.vHC.rZ();
          return 0;
        case 6: 
          localq.hcp = locala.vHC.rZ();
          return 0;
        case 7: 
          localq.hcq = locala.vHC.readString();
          return 0;
        case 8: 
          localq.hbQ = locala.vHC.readString();
          return 0;
        case 9: 
          localq.hcr = locala.vHC.readString();
          return 0;
        case 10: 
          localq.hcs = locala.cJR();
          return 0;
        }
        localq.hct = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/h/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */