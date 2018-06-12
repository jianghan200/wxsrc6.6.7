package com.tencent.mm.protocal.c;

public final class brd
  extends com.tencent.mm.bk.a
{
  public int hcC;
  public int rxy;
  public int spm;
  public int spn;
  public int spo;
  public int spp;
  public int spq;
  public int spr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hcC);
      paramVarArgs.fT(2, this.rxy);
      paramVarArgs.fT(3, this.spm);
      paramVarArgs.fT(4, this.spn);
      paramVarArgs.fT(5, this.spo);
      paramVarArgs.fT(6, this.spp);
      paramVarArgs.fT(7, this.spq);
      paramVarArgs.fT(8, this.spr);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.hcC) + 0 + f.a.a.a.fQ(2, this.rxy) + f.a.a.a.fQ(3, this.spm) + f.a.a.a.fQ(4, this.spn) + f.a.a.a.fQ(5, this.spo) + f.a.a.a.fQ(6, this.spp) + f.a.a.a.fQ(7, this.spq) + f.a.a.a.fQ(8, this.spr);
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
      brd localbrd = (brd)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbrd.hcC = locala.vHC.rY();
        return 0;
      case 2: 
        localbrd.rxy = locala.vHC.rY();
        return 0;
      case 3: 
        localbrd.spm = locala.vHC.rY();
        return 0;
      case 4: 
        localbrd.spn = locala.vHC.rY();
        return 0;
      case 5: 
        localbrd.spo = locala.vHC.rY();
        return 0;
      case 6: 
        localbrd.spp = locala.vHC.rY();
        return 0;
      case 7: 
        localbrd.spq = locala.vHC.rY();
        return 0;
      }
      localbrd.spr = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/brd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */