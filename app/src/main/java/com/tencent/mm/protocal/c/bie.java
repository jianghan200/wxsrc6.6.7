package com.tencent.mm.protocal.c;

public final class bie
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public String rJU;
  public String sdV;
  public String sdW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rJU != null) {
        paramVarArgs.g(1, this.rJU);
      }
      if (this.sdW != null) {
        paramVarArgs.g(2, this.sdW);
      }
      paramVarArgs.fT(3, this.hbF);
      if (this.sdV != null) {
        paramVarArgs.g(4, this.sdV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rJU == null) {
        break label328;
      }
    }
    label328:
    for (paramInt = f.a.a.b.b.a.h(1, this.rJU) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sdW != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sdW);
      }
      i += f.a.a.a.fQ(3, this.hbF);
      paramInt = i;
      if (this.sdV != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sdV);
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
        bie localbie = (bie)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbie.rJU = locala.vHC.readString();
          return 0;
        case 2: 
          localbie.sdW = locala.vHC.readString();
          return 0;
        case 3: 
          localbie.hbF = locala.vHC.rY();
          return 0;
        }
        localbie.sdV = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */