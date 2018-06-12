package com.tencent.mm.plugin.backup.h;

import f.a.a.b;

public final class y
  extends com.tencent.mm.bk.a
{
  public String hcI;
  public int hcJ;
  public int hcL;
  public int hcM;
  public int hcd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hcI == null) {
        throw new b("Not all required fields were included: DataID");
      }
      if (this.hcI != null) {
        paramVarArgs.g(1, this.hcI);
      }
      paramVarArgs.fT(2, this.hcJ);
      paramVarArgs.fT(3, this.hcL);
      paramVarArgs.fT(4, this.hcM);
      paramVarArgs.fT(5, this.hcd);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hcI == null) {
        break label354;
      }
    }
    label354:
    for (paramInt = f.a.a.b.b.a.h(1, this.hcI) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hcJ) + f.a.a.a.fQ(3, this.hcL) + f.a.a.a.fQ(4, this.hcM) + f.a.a.a.fQ(5, this.hcd);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.hcI != null) {
          break;
        }
        throw new b("Not all required fields were included: DataID");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        y localy = (y)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localy.hcI = locala.vHC.readString();
          return 0;
        case 2: 
          localy.hcJ = locala.vHC.rY();
          return 0;
        case 3: 
          localy.hcL = locala.vHC.rY();
          return 0;
        case 4: 
          localy.hcM = locala.vHC.rY();
          return 0;
        }
        localy.hcd = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/h/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */