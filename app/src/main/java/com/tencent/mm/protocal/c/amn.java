package com.tencent.mm.protocal.c;

public final class amn
  extends com.tencent.mm.bk.a
{
  public String bWP;
  public int huV;
  public String hwg;
  public String rIw;
  public int rPk;
  public long rPl;
  public long rPm;
  public String rrW;
  public long ruW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rrW != null) {
        paramVarArgs.g(1, this.rrW);
      }
      paramVarArgs.T(2, this.ruW);
      paramVarArgs.fT(3, this.rPk);
      paramVarArgs.T(4, this.rPl);
      paramVarArgs.T(5, this.rPm);
      if (this.rIw != null) {
        paramVarArgs.g(6, this.rIw);
      }
      if (this.hwg != null) {
        paramVarArgs.g(7, this.hwg);
      }
      paramVarArgs.fT(8, this.huV);
      if (this.bWP != null) {
        paramVarArgs.g(9, this.bWP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rrW == null) {
        break label539;
      }
    }
    label539:
    for (paramInt = f.a.a.b.b.a.h(1, this.rrW) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.S(2, this.ruW) + f.a.a.a.fQ(3, this.rPk) + f.a.a.a.S(4, this.rPl) + f.a.a.a.S(5, this.rPm);
      paramInt = i;
      if (this.rIw != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rIw);
      }
      i = paramInt;
      if (this.hwg != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.hwg);
      }
      i += f.a.a.a.fQ(8, this.huV);
      paramInt = i;
      if (this.bWP != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.bWP);
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
        amn localamn = (amn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localamn.rrW = locala.vHC.readString();
          return 0;
        case 2: 
          localamn.ruW = locala.vHC.rZ();
          return 0;
        case 3: 
          localamn.rPk = locala.vHC.rY();
          return 0;
        case 4: 
          localamn.rPl = locala.vHC.rZ();
          return 0;
        case 5: 
          localamn.rPm = locala.vHC.rZ();
          return 0;
        case 6: 
          localamn.rIw = locala.vHC.readString();
          return 0;
        case 7: 
          localamn.hwg = locala.vHC.readString();
          return 0;
        case 8: 
          localamn.huV = locala.vHC.rY();
          return 0;
        }
        localamn.bWP = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/amn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */