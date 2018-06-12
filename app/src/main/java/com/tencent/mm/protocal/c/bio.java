package com.tencent.mm.protocal.c;

public final class bio
  extends com.tencent.mm.bk.a
{
  public String fJU;
  public String jOS;
  public String rQD;
  public String rjR;
  public int sjd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rjR != null) {
        paramVarArgs.g(1, this.rjR);
      }
      if (this.jOS != null) {
        paramVarArgs.g(2, this.jOS);
      }
      paramVarArgs.fT(3, this.sjd);
      if (this.fJU != null) {
        paramVarArgs.g(4, this.fJU);
      }
      if (this.rQD != null) {
        paramVarArgs.g(5, this.rQD);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rjR == null) {
        break label383;
      }
    }
    label383:
    for (paramInt = f.a.a.b.b.a.h(1, this.rjR) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jOS);
      }
      i += f.a.a.a.fQ(3, this.sjd);
      paramInt = i;
      if (this.fJU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.fJU);
      }
      i = paramInt;
      if (this.rQD != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rQD);
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
        bio localbio = (bio)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbio.rjR = locala.vHC.readString();
          return 0;
        case 2: 
          localbio.jOS = locala.vHC.readString();
          return 0;
        case 3: 
          localbio.sjd = locala.vHC.rY();
          return 0;
        case 4: 
          localbio.fJU = locala.vHC.readString();
          return 0;
        }
        localbio.rQD = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */