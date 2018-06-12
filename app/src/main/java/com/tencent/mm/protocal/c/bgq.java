package com.tencent.mm.protocal.c;

public final class bgq
  extends com.tencent.mm.bk.a
{
  public String hcq;
  public int ngG;
  public String rjL;
  public String rjM;
  public String rjN;
  public String rjO;
  public int shA;
  public int shB;
  public String shC;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hcq != null) {
        paramVarArgs.g(1, this.hcq);
      }
      paramVarArgs.fT(2, this.shA);
      if (this.rjL != null) {
        paramVarArgs.g(3, this.rjL);
      }
      if (this.rjM != null) {
        paramVarArgs.g(4, this.rjM);
      }
      paramVarArgs.fT(5, this.ngG);
      paramVarArgs.fT(6, this.shB);
      if (this.rjN != null) {
        paramVarArgs.g(7, this.rjN);
      }
      if (this.rjO != null) {
        paramVarArgs.g(8, this.rjO);
      }
      if (this.shC != null) {
        paramVarArgs.g(9, this.shC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hcq == null) {
        break label575;
      }
    }
    label575:
    for (paramInt = f.a.a.b.b.a.h(1, this.hcq) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.shA);
      paramInt = i;
      if (this.rjL != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rjL);
      }
      i = paramInt;
      if (this.rjM != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rjM);
      }
      i = i + f.a.a.a.fQ(5, this.ngG) + f.a.a.a.fQ(6, this.shB);
      paramInt = i;
      if (this.rjN != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rjN);
      }
      i = paramInt;
      if (this.rjO != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rjO);
      }
      paramInt = i;
      if (this.shC != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.shC);
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
        bgq localbgq = (bgq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbgq.hcq = locala.vHC.readString();
          return 0;
        case 2: 
          localbgq.shA = locala.vHC.rY();
          return 0;
        case 3: 
          localbgq.rjL = locala.vHC.readString();
          return 0;
        case 4: 
          localbgq.rjM = locala.vHC.readString();
          return 0;
        case 5: 
          localbgq.ngG = locala.vHC.rY();
          return 0;
        case 6: 
          localbgq.shB = locala.vHC.rY();
          return 0;
        case 7: 
          localbgq.rjN = locala.vHC.readString();
          return 0;
        case 8: 
          localbgq.rjO = locala.vHC.readString();
          return 0;
        }
        localbgq.shC = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */