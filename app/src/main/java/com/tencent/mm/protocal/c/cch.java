package com.tencent.mm.protocal.c;

public final class cch
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String ksB;
  public int rbZ;
  public String rem;
  public String sdK;
  public String sym;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.sdK != null) {
        paramVarArgs.g(2, this.sdK);
      }
      if (this.ksB != null) {
        paramVarArgs.g(3, this.ksB);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.sym != null) {
        paramVarArgs.g(5, this.sym);
      }
      paramVarArgs.fT(6, this.rbZ);
      if (this.rem != null) {
        paramVarArgs.g(7, this.rem);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label497;
      }
    }
    label497:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.sdK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.sdK);
      }
      i = paramInt;
      if (this.ksB != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ksB);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.sym != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sym);
      }
      i += f.a.a.a.fQ(6, this.rbZ);
      paramInt = i;
      if (this.rem != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rem);
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
        cch localcch = (cch)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcch.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localcch.sdK = locala.vHC.readString();
          return 0;
        case 3: 
          localcch.ksB = locala.vHC.readString();
          return 0;
        case 4: 
          localcch.jOS = locala.vHC.readString();
          return 0;
        case 5: 
          localcch.sym = locala.vHC.readString();
          return 0;
        case 6: 
          localcch.rbZ = locala.vHC.rY();
          return 0;
        }
        localcch.rem = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */