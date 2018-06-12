package com.tencent.mm.protocal.c;

public final class cfa
  extends com.tencent.mm.bk.a
{
  public int hbF;
  public int hcE;
  public String jTu;
  public int lOH;
  public int rWU;
  public String rco;
  public int szG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jTu != null) {
        paramVarArgs.g(1, this.jTu);
      }
      paramVarArgs.fT(2, this.hcE);
      paramVarArgs.fT(3, this.hbF);
      paramVarArgs.fT(4, this.lOH);
      paramVarArgs.fT(5, this.rWU);
      if (this.rco != null) {
        paramVarArgs.g(6, this.rco);
      }
      paramVarArgs.fT(7, this.szG);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jTu == null) {
        break label425;
      }
    }
    label425:
    for (paramInt = f.a.a.b.b.a.h(1, this.jTu) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcE) + f.a.a.a.fQ(3, this.hbF) + f.a.a.a.fQ(4, this.lOH) + f.a.a.a.fQ(5, this.rWU);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rco);
      }
      return paramInt + f.a.a.a.fQ(7, this.szG);
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
        cfa localcfa = (cfa)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcfa.jTu = locala.vHC.readString();
          return 0;
        case 2: 
          localcfa.hcE = locala.vHC.rY();
          return 0;
        case 3: 
          localcfa.hbF = locala.vHC.rY();
          return 0;
        case 4: 
          localcfa.lOH = locala.vHC.rY();
          return 0;
        case 5: 
          localcfa.rWU = locala.vHC.rY();
          return 0;
        case 6: 
          localcfa.rco = locala.vHC.readString();
          return 0;
        }
        localcfa.szG = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */