package com.tencent.mm.protocal.c;

public final class avm
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String hbL;
  public String jOS;
  public long rcq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(2, this.jOS);
      }
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      paramVarArgs.T(4, this.rcq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label324;
      }
    }
    label324:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOS);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbL);
      }
      return i + f.a.a.a.S(4, this.rcq);
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
        avm localavm = (avm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localavm.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localavm.jOS = locala.vHC.readString();
          return 0;
        case 3: 
          localavm.hbL = locala.vHC.readString();
          return 0;
        }
        localavm.rcq = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/avm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */