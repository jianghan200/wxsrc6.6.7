package com.tencent.mm.protocal.c;

public final class azj
  extends com.tencent.mm.bk.a
{
  public String bPS;
  public String huW;
  public String rnD;
  public int scb;
  public String scc;
  public String scd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bPS != null) {
        paramVarArgs.g(1, this.bPS);
      }
      paramVarArgs.fT(2, this.scb);
      if (this.scc != null) {
        paramVarArgs.g(3, this.scc);
      }
      if (this.scd != null) {
        paramVarArgs.g(4, this.scd);
      }
      if (this.rnD != null) {
        paramVarArgs.g(5, this.rnD);
      }
      if (this.huW != null) {
        paramVarArgs.g(6, this.huW);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bPS == null) {
        break label438;
      }
    }
    label438:
    for (paramInt = f.a.a.b.b.a.h(1, this.bPS) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.scb);
      paramInt = i;
      if (this.scc != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.scc);
      }
      i = paramInt;
      if (this.scd != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.scd);
      }
      paramInt = i;
      if (this.rnD != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rnD);
      }
      i = paramInt;
      if (this.huW != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.huW);
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
        azj localazj = (azj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localazj.bPS = locala.vHC.readString();
          return 0;
        case 2: 
          localazj.scb = locala.vHC.rY();
          return 0;
        case 3: 
          localazj.scc = locala.vHC.readString();
          return 0;
        case 4: 
          localazj.scd = locala.vHC.readString();
          return 0;
        case 5: 
          localazj.rnD = locala.vHC.readString();
          return 0;
        }
        localazj.huW = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/azj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */