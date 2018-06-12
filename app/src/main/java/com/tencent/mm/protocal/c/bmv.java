package com.tencent.mm.protocal.c;

public final class bmv
  extends com.tencent.mm.bk.a
{
  public String cac;
  public String cad;
  public String huU;
  public String qZN;
  public String qZO;
  public int qZP;
  public String sla;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac != null) {
        paramVarArgs.g(1, this.cac);
      }
      if (this.huU != null) {
        paramVarArgs.g(2, this.huU);
      }
      if (this.cad != null) {
        paramVarArgs.g(3, this.cad);
      }
      if (this.qZN != null) {
        paramVarArgs.g(4, this.qZN);
      }
      if (this.qZO != null) {
        paramVarArgs.g(5, this.qZO);
      }
      paramVarArgs.fT(6, this.qZP);
      if (this.sla != null) {
        paramVarArgs.g(7, this.sla);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.cac == null) {
        break label497;
      }
    }
    label497:
    for (int i = f.a.a.b.b.a.h(1, this.cac) + 0;; i = 0)
    {
      paramInt = i;
      if (this.huU != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.huU);
      }
      i = paramInt;
      if (this.cad != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.cad);
      }
      paramInt = i;
      if (this.qZN != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.qZN);
      }
      i = paramInt;
      if (this.qZO != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.qZO);
      }
      i += f.a.a.a.fQ(6, this.qZP);
      paramInt = i;
      if (this.sla != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.sla);
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
        bmv localbmv = (bmv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbmv.cac = locala.vHC.readString();
          return 0;
        case 2: 
          localbmv.huU = locala.vHC.readString();
          return 0;
        case 3: 
          localbmv.cad = locala.vHC.readString();
          return 0;
        case 4: 
          localbmv.qZN = locala.vHC.readString();
          return 0;
        case 5: 
          localbmv.qZO = locala.vHC.readString();
          return 0;
        case 6: 
          localbmv.qZP = locala.vHC.rY();
          return 0;
        }
        localbmv.sla = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bmv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */