package com.tencent.mm.protocal.c;

public final class btf
  extends com.tencent.mm.bk.a
{
  public String bWP;
  public String bWQ;
  public int csE;
  public long eiD;
  public int pLn;
  public int pMm;
  public int pMn;
  public int pMo;
  public long sqE;
  public int sqF;
  public long sqG;
  public String text;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bWQ != null) {
        paramVarArgs.g(1, this.bWQ);
      }
      paramVarArgs.fT(2, this.pMm);
      paramVarArgs.fT(3, this.pMn);
      paramVarArgs.T(4, this.eiD);
      paramVarArgs.fT(5, this.pLn);
      paramVarArgs.fT(6, this.type);
      if (this.text != null) {
        paramVarArgs.g(7, this.text);
      }
      if (this.bWP != null) {
        paramVarArgs.g(8, this.bWP);
      }
      paramVarArgs.T(9, this.sqE);
      paramVarArgs.fT(10, this.pMo);
      paramVarArgs.fT(11, this.sqF);
      paramVarArgs.T(12, this.sqG);
      paramVarArgs.fT(13, this.csE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bWQ == null) {
        break label675;
      }
    }
    label675:
    for (paramInt = f.a.a.b.b.a.h(1, this.bWQ) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.pMm) + f.a.a.a.fQ(3, this.pMn) + f.a.a.a.S(4, this.eiD) + f.a.a.a.fQ(5, this.pLn) + f.a.a.a.fQ(6, this.type);
      paramInt = i;
      if (this.text != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.text);
      }
      i = paramInt;
      if (this.bWP != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.bWP);
      }
      return i + f.a.a.a.S(9, this.sqE) + f.a.a.a.fQ(10, this.pMo) + f.a.a.a.fQ(11, this.sqF) + f.a.a.a.S(12, this.sqG) + f.a.a.a.fQ(13, this.csE);
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
        btf localbtf = (btf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbtf.bWQ = locala.vHC.readString();
          return 0;
        case 2: 
          localbtf.pMm = locala.vHC.rY();
          return 0;
        case 3: 
          localbtf.pMn = locala.vHC.rY();
          return 0;
        case 4: 
          localbtf.eiD = locala.vHC.rZ();
          return 0;
        case 5: 
          localbtf.pLn = locala.vHC.rY();
          return 0;
        case 6: 
          localbtf.type = locala.vHC.rY();
          return 0;
        case 7: 
          localbtf.text = locala.vHC.readString();
          return 0;
        case 8: 
          localbtf.bWP = locala.vHC.readString();
          return 0;
        case 9: 
          localbtf.sqE = locala.vHC.rZ();
          return 0;
        case 10: 
          localbtf.pMo = locala.vHC.rY();
          return 0;
        case 11: 
          localbtf.sqF = locala.vHC.rY();
          return 0;
        case 12: 
          localbtf.sqG = locala.vHC.rZ();
          return 0;
        }
        localbtf.csE = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/btf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */