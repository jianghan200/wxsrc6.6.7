package com.tencent.mm.protocal.c;

public final class bpi
  extends com.tencent.mm.bk.a
{
  public int nRo;
  public int nRp;
  public String rds;
  public String rdt;
  public String rdu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rds != null) {
        paramVarArgs.g(1, this.rds);
      }
      if (this.rdt != null) {
        paramVarArgs.g(2, this.rdt);
      }
      if (this.rdu != null) {
        paramVarArgs.g(3, this.rdu);
      }
      paramVarArgs.fT(4, this.nRo);
      paramVarArgs.fT(5, this.nRp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rds == null) {
        break label363;
      }
    }
    label363:
    for (int i = f.a.a.b.b.a.h(1, this.rds) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rdt != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rdt);
      }
      i = paramInt;
      if (this.rdu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rdu);
      }
      return i + f.a.a.a.fQ(4, this.nRo) + f.a.a.a.fQ(5, this.nRp);
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
        bpi localbpi = (bpi)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbpi.rds = locala.vHC.readString();
          return 0;
        case 2: 
          localbpi.rdt = locala.vHC.readString();
          return 0;
        case 3: 
          localbpi.rdu = locala.vHC.readString();
          return 0;
        case 4: 
          localbpi.nRo = locala.vHC.rY();
          return 0;
        }
        localbpi.nRp = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */