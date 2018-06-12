package com.tencent.mm.protocal.c;

public final class fj
  extends com.tencent.mm.bk.a
{
  public String imei;
  public String rgo;
  public String rgp;
  public String rgq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.imei != null) {
        paramVarArgs.g(1, this.imei);
      }
      if (this.rgo != null) {
        paramVarArgs.g(2, this.rgo);
      }
      if (this.rgp != null) {
        paramVarArgs.g(3, this.rgp);
      }
      if (this.rgq != null) {
        paramVarArgs.g(4, this.rgq);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.imei == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.imei) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rgo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rgo);
      }
      i = paramInt;
      if (this.rgp != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rgp);
      }
      paramInt = i;
      if (this.rgq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rgq);
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
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        fj localfj = (fj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localfj.imei = locala.vHC.readString();
          return 0;
        case 2: 
          localfj.rgo = locala.vHC.readString();
          return 0;
        case 3: 
          localfj.rgp = locala.vHC.readString();
          return 0;
        }
        localfj.rgq = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/fj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */