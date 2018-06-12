package com.tencent.mm.protocal.c;

public final class cfg
  extends com.tencent.mm.bk.a
{
  public String hcS;
  public com.tencent.mm.bk.b szc;
  public String szk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      if (this.hcS == null) {
        throw new f.a.a.b("Not all required fields were included: NickName");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.szc != null) {
        paramVarArgs.b(3, this.szc);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label354;
      }
    }
    label354:
    for (int i = f.a.a.b.b.a.h(1, this.szk) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.szc != null) {
        i = paramInt + f.a.a.a.a(3, this.szc);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.szk == null) {
          throw new f.a.a.b("Not all required fields were included: Talker");
        }
        if (this.hcS != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: NickName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cfg localcfg = (cfg)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcfg.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcfg.hcS = locala.vHC.readString();
          return 0;
        }
        localcfg.szc = locala.cJR();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cfg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */