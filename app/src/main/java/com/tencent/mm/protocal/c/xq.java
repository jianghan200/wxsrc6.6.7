package com.tencent.mm.protocal.c;

public final class xq
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public String jPM;
  public int qZg;
  public String rDu;
  public String rDv;
  public String rDw;
  public String rbW;
  public String rhq;
  public String rsy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rbW != null) {
        paramVarArgs.g(1, this.rbW);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
      }
      if (this.jPM != null) {
        paramVarArgs.g(4, this.jPM);
      }
      if (this.rDu != null) {
        paramVarArgs.g(5, this.rDu);
      }
      if (this.rDv != null) {
        paramVarArgs.g(6, this.rDv);
      }
      if (this.rhq != null) {
        paramVarArgs.g(7, this.rhq);
      }
      if (this.rsy != null) {
        paramVarArgs.g(8, this.rsy);
      }
      if (this.rDw != null) {
        paramVarArgs.g(9, this.rDw);
      }
      paramVarArgs.fT(10, this.qZg);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rbW == null) {
        break label666;
      }
    }
    label666:
    for (int i = f.a.a.b.b.a.h(1, this.rbW) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hbL);
      }
      paramInt = i;
      if (this.jPM != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPM);
      }
      i = paramInt;
      if (this.rDu != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rDu);
      }
      paramInt = i;
      if (this.rDv != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rDv);
      }
      i = paramInt;
      if (this.rhq != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rhq);
      }
      paramInt = i;
      if (this.rsy != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rsy);
      }
      i = paramInt;
      if (this.rDw != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rDw);
      }
      return i + f.a.a.a.fQ(10, this.qZg);
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
        xq localxq = (xq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localxq.rbW = locala.vHC.readString();
          return 0;
        case 2: 
          localxq.hcS = locala.vHC.readString();
          return 0;
        case 3: 
          localxq.hbL = locala.vHC.readString();
          return 0;
        case 4: 
          localxq.jPM = locala.vHC.readString();
          return 0;
        case 5: 
          localxq.rDu = locala.vHC.readString();
          return 0;
        case 6: 
          localxq.rDv = locala.vHC.readString();
          return 0;
        case 7: 
          localxq.rhq = locala.vHC.readString();
          return 0;
        case 8: 
          localxq.rsy = locala.vHC.readString();
          return 0;
        case 9: 
          localxq.rDw = locala.vHC.readString();
          return 0;
        }
        localxq.qZg = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/xq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */