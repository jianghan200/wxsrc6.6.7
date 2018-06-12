package com.tencent.mm.protocal.c;

public final class wz
  extends com.tencent.mm.bk.a
{
  public int rBY;
  public int rBZ;
  public int rCa;
  public int rCb;
  public int rCc;
  public int rCd;
  public int rCe;
  public int rCf;
  public int rCg;
  public int rCh;
  public int rCi;
  public int rCj;
  public int rCk;
  public int rCl;
  public int rCm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rBY);
      paramVarArgs.fT(2, this.rBZ);
      paramVarArgs.fT(3, this.rCa);
      paramVarArgs.fT(4, this.rCb);
      paramVarArgs.fT(5, this.rCc);
      paramVarArgs.fT(6, this.rCd);
      paramVarArgs.fT(7, this.rCe);
      paramVarArgs.fT(8, this.rCf);
      paramVarArgs.fT(9, this.rCg);
      paramVarArgs.fT(10, this.rCh);
      paramVarArgs.fT(11, this.rCi);
      paramVarArgs.fT(12, this.rCj);
      paramVarArgs.fT(13, this.rCk);
      paramVarArgs.fT(14, this.rCl);
      paramVarArgs.fT(15, this.rCm);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rBY) + 0 + f.a.a.a.fQ(2, this.rBZ) + f.a.a.a.fQ(3, this.rCa) + f.a.a.a.fQ(4, this.rCb) + f.a.a.a.fQ(5, this.rCc) + f.a.a.a.fQ(6, this.rCd) + f.a.a.a.fQ(7, this.rCe) + f.a.a.a.fQ(8, this.rCf) + f.a.a.a.fQ(9, this.rCg) + f.a.a.a.fQ(10, this.rCh) + f.a.a.a.fQ(11, this.rCi) + f.a.a.a.fQ(12, this.rCj) + f.a.a.a.fQ(13, this.rCk) + f.a.a.a.fQ(14, this.rCl) + f.a.a.a.fQ(15, this.rCm);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      wz localwz = (wz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localwz.rBY = locala.vHC.rY();
        return 0;
      case 2: 
        localwz.rBZ = locala.vHC.rY();
        return 0;
      case 3: 
        localwz.rCa = locala.vHC.rY();
        return 0;
      case 4: 
        localwz.rCb = locala.vHC.rY();
        return 0;
      case 5: 
        localwz.rCc = locala.vHC.rY();
        return 0;
      case 6: 
        localwz.rCd = locala.vHC.rY();
        return 0;
      case 7: 
        localwz.rCe = locala.vHC.rY();
        return 0;
      case 8: 
        localwz.rCf = locala.vHC.rY();
        return 0;
      case 9: 
        localwz.rCg = locala.vHC.rY();
        return 0;
      case 10: 
        localwz.rCh = locala.vHC.rY();
        return 0;
      case 11: 
        localwz.rCi = locala.vHC.rY();
        return 0;
      case 12: 
        localwz.rCj = locala.vHC.rY();
        return 0;
      case 13: 
        localwz.rCk = locala.vHC.rY();
        return 0;
      case 14: 
        localwz.rCl = locala.vHC.rY();
        return 0;
      }
      localwz.rCm = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */