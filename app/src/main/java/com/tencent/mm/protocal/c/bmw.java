package com.tencent.mm.protocal.c;

public final class bmw
  extends com.tencent.mm.bk.a
{
  public String cac;
  public int hyk;
  public int rqg;
  public long slb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac != null) {
        paramVarArgs.g(1, this.cac);
      }
      paramVarArgs.fT(2, this.hyk);
      paramVarArgs.fT(3, this.rqg);
      paramVarArgs.T(4, this.slb);
      return 0;
    }
    if (paramInt == 1) {
      if (this.cac == null) {
        break label284;
      }
    }
    label284:
    for (paramInt = f.a.a.b.b.a.h(1, this.cac) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hyk) + f.a.a.a.fQ(3, this.rqg) + f.a.a.a.S(4, this.slb);
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
        bmw localbmw = (bmw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbmw.cac = locala.vHC.readString();
          return 0;
        case 2: 
          localbmw.hyk = locala.vHC.rY();
          return 0;
        case 3: 
          localbmw.rqg = locala.vHC.rY();
          return 0;
        }
        localbmw.slb = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bmw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */