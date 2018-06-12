package com.tencent.mm.protocal.c;

public final class cdm
  extends com.tencent.mm.bk.a
{
  public String hbP;
  public String reT;
  public String rjL;
  public String rjM;
  public String rjN;
  public String rjO;
  public String syX;
  public String syY;
  public String syZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.reT != null) {
        paramVarArgs.g(1, this.reT);
      }
      if (this.rjM != null) {
        paramVarArgs.g(2, this.rjM);
      }
      if (this.rjL != null) {
        paramVarArgs.g(3, this.rjL);
      }
      if (this.hbP != null) {
        paramVarArgs.g(4, this.hbP);
      }
      if (this.syX != null) {
        paramVarArgs.g(5, this.syX);
      }
      if (this.rjN != null) {
        paramVarArgs.g(6, this.rjN);
      }
      if (this.rjO != null) {
        paramVarArgs.g(7, this.rjO);
      }
      if (this.syY != null) {
        paramVarArgs.g(8, this.syY);
      }
      if (this.syZ != null) {
        paramVarArgs.g(9, this.syZ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.reT == null) {
        break label627;
      }
    }
    label627:
    for (int i = f.a.a.b.b.a.h(1, this.reT) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rjM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rjM);
      }
      i = paramInt;
      if (this.rjL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rjL);
      }
      paramInt = i;
      if (this.hbP != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hbP);
      }
      i = paramInt;
      if (this.syX != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.syX);
      }
      paramInt = i;
      if (this.rjN != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rjN);
      }
      i = paramInt;
      if (this.rjO != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rjO);
      }
      paramInt = i;
      if (this.syY != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.syY);
      }
      i = paramInt;
      if (this.syZ != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.syZ);
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
        cdm localcdm = (cdm)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcdm.reT = locala.vHC.readString();
          return 0;
        case 2: 
          localcdm.rjM = locala.vHC.readString();
          return 0;
        case 3: 
          localcdm.rjL = locala.vHC.readString();
          return 0;
        case 4: 
          localcdm.hbP = locala.vHC.readString();
          return 0;
        case 5: 
          localcdm.syX = locala.vHC.readString();
          return 0;
        case 6: 
          localcdm.rjN = locala.vHC.readString();
          return 0;
        case 7: 
          localcdm.rjO = locala.vHC.readString();
          return 0;
        case 8: 
          localcdm.syY = locala.vHC.readString();
          return 0;
        }
        localcdm.syZ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cdm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */