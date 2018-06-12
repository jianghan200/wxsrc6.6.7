package com.tencent.mm.protocal.c;

public final class ccy
  extends com.tencent.mm.bk.a
{
  public int eIy;
  public String lPe;
  public int otY;
  public String rUM;
  public String shK;
  public String syA;
  public String syB;
  public String syC;
  public String syD;
  public String syz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.syz != null) {
        paramVarArgs.g(1, this.syz);
      }
      if (this.syA != null) {
        paramVarArgs.g(2, this.syA);
      }
      if (this.rUM != null) {
        paramVarArgs.g(3, this.rUM);
      }
      if (this.shK != null) {
        paramVarArgs.g(4, this.shK);
      }
      paramVarArgs.fT(5, this.eIy);
      if (this.lPe != null) {
        paramVarArgs.g(6, this.lPe);
      }
      if (this.syB != null) {
        paramVarArgs.g(7, this.syB);
      }
      if (this.syC != null) {
        paramVarArgs.g(8, this.syC);
      }
      paramVarArgs.fT(9, this.otY);
      if (this.syD != null) {
        paramVarArgs.g(19, this.syD);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.syz == null) {
        break label686;
      }
    }
    label686:
    for (int i = f.a.a.b.b.a.h(1, this.syz) + 0;; i = 0)
    {
      paramInt = i;
      if (this.syA != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.syA);
      }
      i = paramInt;
      if (this.rUM != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rUM);
      }
      paramInt = i;
      if (this.shK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.shK);
      }
      i = paramInt + f.a.a.a.fQ(5, this.eIy);
      paramInt = i;
      if (this.lPe != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.lPe);
      }
      i = paramInt;
      if (this.syB != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.syB);
      }
      paramInt = i;
      if (this.syC != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.syC);
      }
      i = paramInt + f.a.a.a.fQ(9, this.otY);
      paramInt = i;
      if (this.syD != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.syD);
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
        ccy localccy = (ccy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        default: 
          return -1;
        case 1: 
          localccy.syz = locala.vHC.readString();
          return 0;
        case 2: 
          localccy.syA = locala.vHC.readString();
          return 0;
        case 3: 
          localccy.rUM = locala.vHC.readString();
          return 0;
        case 4: 
          localccy.shK = locala.vHC.readString();
          return 0;
        case 5: 
          localccy.eIy = locala.vHC.rY();
          return 0;
        case 6: 
          localccy.lPe = locala.vHC.readString();
          return 0;
        case 7: 
          localccy.syB = locala.vHC.readString();
          return 0;
        case 8: 
          localccy.syC = locala.vHC.readString();
          return 0;
        case 9: 
          localccy.otY = locala.vHC.rY();
          return 0;
        }
        localccy.syD = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ccy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */