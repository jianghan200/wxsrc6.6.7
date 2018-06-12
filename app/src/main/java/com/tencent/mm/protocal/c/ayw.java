package com.tencent.mm.protocal.c;

public final class ayw
  extends com.tencent.mm.bk.a
{
  public String hFk;
  public String hFm;
  public String hva;
  public String pnl;
  public String sbE;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hva != null) {
        paramVarArgs.g(1, this.hva);
      }
      if (this.pnl != null) {
        paramVarArgs.g(2, this.pnl);
      }
      if (this.hFm != null) {
        paramVarArgs.g(3, this.hFm);
      }
      if (this.hFk != null) {
        paramVarArgs.g(4, this.hFk);
      }
      if (this.sbE != null) {
        paramVarArgs.g(5, this.sbE);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hva == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.hva) + 0;; i = 0)
    {
      paramInt = i;
      if (this.pnl != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.pnl);
      }
      i = paramInt;
      if (this.hFm != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hFm);
      }
      paramInt = i;
      if (this.hFk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hFk);
      }
      i = paramInt;
      if (this.sbE != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sbE);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ayw localayw = (ayw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localayw.hva = locala.vHC.readString();
          return 0;
        case 2: 
          localayw.pnl = locala.vHC.readString();
          return 0;
        case 3: 
          localayw.hFm = locala.vHC.readString();
          return 0;
        case 4: 
          localayw.hFk = locala.vHC.readString();
          return 0;
        }
        localayw.sbE = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/ayw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */