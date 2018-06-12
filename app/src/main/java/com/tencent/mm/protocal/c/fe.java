package com.tencent.mm.protocal.c;

public final class fe
  extends com.tencent.mm.bk.a
{
  public String knE;
  public String lMV;
  public String lNU;
  public String rga;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rga != null) {
        paramVarArgs.g(1, this.rga);
      }
      if (this.lMV != null) {
        paramVarArgs.g(2, this.lMV);
      }
      if (this.knE != null) {
        paramVarArgs.g(3, this.knE);
      }
      if (this.lNU != null) {
        paramVarArgs.g(4, this.lNU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rga == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.rga) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lMV != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.lMV);
      }
      i = paramInt;
      if (this.knE != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.knE);
      }
      paramInt = i;
      if (this.lNU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.lNU);
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
        fe localfe = (fe)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localfe.rga = locala.vHC.readString();
          return 0;
        case 2: 
          localfe.lMV = locala.vHC.readString();
          return 0;
        case 3: 
          localfe.knE = locala.vHC.readString();
          return 0;
        }
        localfe.lNU = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */