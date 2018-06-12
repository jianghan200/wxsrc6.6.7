package com.tencent.mm.protocal.c;

public final class amz
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public int hcE;
  public String jPK;
  public String jSv;
  public String rPM;
  public String rPN;
  public String rPO;
  public String rPP;
  public int rPQ;
  public String rPR;
  public String rst;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.rPM != null) {
        paramVarArgs.g(2, this.rPM);
      }
      paramVarArgs.fT(3, this.hcE);
      if (this.jPK != null) {
        paramVarArgs.g(4, this.jPK);
      }
      if (this.rPN != null) {
        paramVarArgs.g(5, this.rPN);
      }
      if (this.rst != null) {
        paramVarArgs.g(6, this.rst);
      }
      if (this.rPO != null) {
        paramVarArgs.g(7, this.rPO);
      }
      if (this.jSv != null) {
        paramVarArgs.g(8, this.jSv);
      }
      if (this.rPP != null) {
        paramVarArgs.g(9, this.rPP);
      }
      paramVarArgs.fT(10, this.rPQ);
      if (this.rPR != null) {
        paramVarArgs.g(11, this.rPR);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label709;
      }
    }
    label709:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rPM != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rPM);
      }
      i += f.a.a.a.fQ(3, this.hcE);
      paramInt = i;
      if (this.jPK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPK);
      }
      i = paramInt;
      if (this.rPN != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rPN);
      }
      paramInt = i;
      if (this.rst != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rst);
      }
      i = paramInt;
      if (this.rPO != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rPO);
      }
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.jSv);
      }
      i = paramInt;
      if (this.rPP != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rPP);
      }
      i += f.a.a.a.fQ(10, this.rPQ);
      paramInt = i;
      if (this.rPR != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rPR);
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
        amz localamz = (amz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localamz.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localamz.rPM = locala.vHC.readString();
          return 0;
        case 3: 
          localamz.hcE = locala.vHC.rY();
          return 0;
        case 4: 
          localamz.jPK = locala.vHC.readString();
          return 0;
        case 5: 
          localamz.rPN = locala.vHC.readString();
          return 0;
        case 6: 
          localamz.rst = locala.vHC.readString();
          return 0;
        case 7: 
          localamz.rPO = locala.vHC.readString();
          return 0;
        case 8: 
          localamz.jSv = locala.vHC.readString();
          return 0;
        case 9: 
          localamz.rPP = locala.vHC.readString();
          return 0;
        case 10: 
          localamz.rPQ = locala.vHC.rY();
          return 0;
        }
        localamz.rPR = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/amz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */