package com.tencent.mm.protocal.c;

public final class ald
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public String rEJ;
  public String rNU;
  public String rNV;
  public int rfn;
  public String rhh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rhh != null) {
        paramVarArgs.g(1, this.rhh);
      }
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.rNU != null) {
        paramVarArgs.g(3, this.rNU);
      }
      if (this.rNV != null) {
        paramVarArgs.g(4, this.rNV);
      }
      paramVarArgs.fT(5, this.rfn);
      if (this.hcS != null) {
        paramVarArgs.g(6, this.hcS);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(7, this.rEJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rhh == null) {
        break label497;
      }
    }
    label497:
    for (int i = f.a.a.b.b.a.h(1, this.rhh) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.rNU != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rNU);
      }
      paramInt = i;
      if (this.rNV != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rNV);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rfn);
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.hcS);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rEJ);
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
        ald localald = (ald)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localald.rhh = locala.vHC.readString();
          return 0;
        case 2: 
          localald.hbL = locala.vHC.readString();
          return 0;
        case 3: 
          localald.rNU = locala.vHC.readString();
          return 0;
        case 4: 
          localald.rNV = locala.vHC.readString();
          return 0;
        case 5: 
          localald.rfn = locala.vHC.rY();
          return 0;
        case 6: 
          localald.hcS = locala.vHC.readString();
          return 0;
        }
        localald.rEJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/ald.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */