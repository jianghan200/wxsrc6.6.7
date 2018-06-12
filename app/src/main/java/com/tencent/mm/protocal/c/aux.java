package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class aux
  extends com.tencent.mm.bk.a
{
  public int rXQ;
  public b rXR;
  public String rXS;
  public int rjI;
  public String rqZ;
  public String rra;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rjI);
      paramVarArgs.fT(2, this.rXQ);
      if (this.rXR != null) {
        paramVarArgs.b(3, this.rXR);
      }
      if (this.rXS != null) {
        paramVarArgs.g(4, this.rXS);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(5, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(6, this.rra);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rjI) + 0 + f.a.a.a.fQ(2, this.rXQ);
      paramInt = i;
      if (this.rXR != null) {
        paramInt = i + f.a.a.a.a(3, this.rXR);
      }
      i = paramInt;
      if (this.rXS != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rXS);
      }
      paramInt = i;
      if (this.rqZ != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rqZ);
      }
      i = paramInt;
    } while (this.rra == null);
    return paramInt + f.a.a.b.b.a.h(6, this.rra);
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
      aux localaux = (aux)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localaux.rjI = locala.vHC.rY();
        return 0;
      case 2: 
        localaux.rXQ = locala.vHC.rY();
        return 0;
      case 3: 
        localaux.rXR = locala.cJR();
        return 0;
      case 4: 
        localaux.rXS = locala.vHC.readString();
        return 0;
      case 5: 
        localaux.rqZ = locala.vHC.readString();
        return 0;
      }
      localaux.rra = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */