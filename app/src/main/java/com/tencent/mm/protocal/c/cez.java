package com.tencent.mm.protocal.c;

public final class cez
  extends com.tencent.mm.bk.a
{
  public int otY;
  public com.tencent.mm.bk.b rdU;
  public long szF;
  public String szk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      if (this.rdU == null) {
        throw new f.a.a.b("Not all required fields were included: VoiceData");
      }
      if (this.szk != null) {
        paramVarArgs.g(1, this.szk);
      }
      paramVarArgs.T(2, this.szF);
      if (this.rdU != null) {
        paramVarArgs.b(3, this.rdU);
      }
      paramVarArgs.fT(4, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szk == null) {
        break label373;
      }
    }
    label373:
    for (paramInt = f.a.a.b.b.a.h(1, this.szk) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.szF);
      paramInt = i;
      if (this.rdU != null) {
        paramInt = i + f.a.a.a.a(3, this.rdU);
      }
      return paramInt + f.a.a.a.fQ(4, this.otY);
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
        if (this.rdU != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: VoiceData");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cez localcez = (cez)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcez.szk = locala.vHC.readString();
          return 0;
        case 2: 
          localcez.szF = locala.vHC.rZ();
          return 0;
        case 3: 
          localcez.rdU = locala.cJR();
          return 0;
        }
        localcez.otY = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */