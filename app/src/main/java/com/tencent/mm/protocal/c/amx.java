package com.tencent.mm.protocal.c;

public final class amx
  extends com.tencent.mm.bk.a
{
  public int hcy;
  public String jPK;
  public String jPe;
  public String rPJ;
  public String rmC;
  public String rmy;
  public String rwk;
  public String rxo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rxo != null) {
        paramVarArgs.g(1, this.rxo);
      }
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      paramVarArgs.fT(3, this.hcy);
      if (this.rwk != null) {
        paramVarArgs.g(4, this.rwk);
      }
      if (this.rmC != null) {
        paramVarArgs.g(5, this.rmC);
      }
      if (this.rmy != null) {
        paramVarArgs.g(6, this.rmy);
      }
      if (this.jPK != null) {
        paramVarArgs.g(7, this.jPK);
      }
      if (this.rPJ != null) {
        paramVarArgs.g(8, this.rPJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rxo == null) {
        break label552;
      }
    }
    label552:
    for (paramInt = f.a.a.b.b.a.h(1, this.rxo) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jPe != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jPe);
      }
      i += f.a.a.a.fQ(3, this.hcy);
      paramInt = i;
      if (this.rwk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwk);
      }
      i = paramInt;
      if (this.rmC != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rmC);
      }
      paramInt = i;
      if (this.rmy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rmy);
      }
      i = paramInt;
      if (this.jPK != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.jPK);
      }
      paramInt = i;
      if (this.rPJ != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rPJ);
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
        amx localamx = (amx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localamx.rxo = locala.vHC.readString();
          return 0;
        case 2: 
          localamx.jPe = locala.vHC.readString();
          return 0;
        case 3: 
          localamx.hcy = locala.vHC.rY();
          return 0;
        case 4: 
          localamx.rwk = locala.vHC.readString();
          return 0;
        case 5: 
          localamx.rmC = locala.vHC.readString();
          return 0;
        case 6: 
          localamx.rmy = locala.vHC.readString();
          return 0;
        case 7: 
          localamx.jPK = locala.vHC.readString();
          return 0;
        }
        localamx.rPJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/amx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */