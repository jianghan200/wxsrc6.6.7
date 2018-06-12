package com.tencent.mm.protocal.c;

public final class atw
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJI;
  public String eJJ;
  public String eJK;
  public String eJQ;
  public String hbL;
  public int hcE;
  public int rWZ;
  public int rXa;
  public String rqZ;
  public String rra;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      paramVarArgs.fT(2, this.hcE);
      paramVarArgs.fT(3, this.eJH);
      if (this.eJJ != null) {
        paramVarArgs.g(4, this.eJJ);
      }
      if (this.eJI != null) {
        paramVarArgs.g(5, this.eJI);
      }
      if (this.eJK != null) {
        paramVarArgs.g(6, this.eJK);
      }
      paramVarArgs.fT(7, this.rWZ);
      paramVarArgs.fT(8, this.rXa);
      if (this.eJQ != null) {
        paramVarArgs.g(9, this.eJQ);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(10, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(11, this.rra);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label673;
      }
    }
    label673:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hcE) + f.a.a.a.fQ(3, this.eJH);
      paramInt = i;
      if (this.eJJ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.eJJ);
      }
      i = paramInt;
      if (this.eJI != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.eJI);
      }
      paramInt = i;
      if (this.eJK != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.eJK);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rWZ) + f.a.a.a.fQ(8, this.rXa);
      paramInt = i;
      if (this.eJQ != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.eJQ);
      }
      i = paramInt;
      if (this.rqZ != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.rqZ);
      }
      paramInt = i;
      if (this.rra != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rra);
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
        atw localatw = (atw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localatw.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localatw.hcE = locala.vHC.rY();
          return 0;
        case 3: 
          localatw.eJH = locala.vHC.rY();
          return 0;
        case 4: 
          localatw.eJJ = locala.vHC.readString();
          return 0;
        case 5: 
          localatw.eJI = locala.vHC.readString();
          return 0;
        case 6: 
          localatw.eJK = locala.vHC.readString();
          return 0;
        case 7: 
          localatw.rWZ = locala.vHC.rY();
          return 0;
        case 8: 
          localatw.rXa = locala.vHC.rY();
          return 0;
        case 9: 
          localatw.eJQ = locala.vHC.readString();
          return 0;
        case 10: 
          localatw.rqZ = locala.vHC.readString();
          return 0;
        }
        localatw.rra = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/atw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */