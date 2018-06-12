package com.tencent.mm.protocal.c;

public final class bpo
  extends com.tencent.mm.bk.a
{
  public float biF;
  public int nOD;
  public float snF;
  public float snG;
  public float snH;
  public float snI;
  public int snJ;
  public long snK;
  public long snL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.l(1, this.snF);
      paramVarArgs.l(2, this.snG);
      paramVarArgs.l(3, this.snH);
      paramVarArgs.l(4, this.snI);
      paramVarArgs.fT(5, this.snJ);
      paramVarArgs.T(6, this.snK);
      paramVarArgs.T(7, this.snL);
      paramVarArgs.l(8, this.biF);
      paramVarArgs.fT(9, this.nOD);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.b.b.a.ec(1) + 4 + 0 + (f.a.a.b.b.a.ec(2) + 4) + (f.a.a.b.b.a.ec(3) + 4) + (f.a.a.b.b.a.ec(4) + 4) + f.a.a.a.fQ(5, this.snJ) + f.a.a.a.S(6, this.snK) + f.a.a.a.S(7, this.snL) + (f.a.a.b.b.a.ec(8) + 4) + f.a.a.a.fQ(9, this.nOD);
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
      bpo localbpo = (bpo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbpo.snF = locala.vHC.readFloat();
        return 0;
      case 2: 
        localbpo.snG = locala.vHC.readFloat();
        return 0;
      case 3: 
        localbpo.snH = locala.vHC.readFloat();
        return 0;
      case 4: 
        localbpo.snI = locala.vHC.readFloat();
        return 0;
      case 5: 
        localbpo.snJ = locala.vHC.rY();
        return 0;
      case 6: 
        localbpo.snK = locala.vHC.rZ();
        return 0;
      case 7: 
        localbpo.snL = locala.vHC.rZ();
        return 0;
      case 8: 
        localbpo.biF = locala.vHC.readFloat();
        return 0;
      }
      localbpo.nOD = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */