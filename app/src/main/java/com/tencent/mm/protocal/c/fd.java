package com.tencent.mm.protocal.c;

public final class fd
  extends com.tencent.mm.bk.a
{
  public String knE;
  public String lMV;
  public String lMW;
  public String pjw;
  public String rfW;
  public String rfX;
  public String rfY;
  public String rfZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rfW != null) {
        paramVarArgs.g(1, this.rfW);
      }
      if (this.pjw != null) {
        paramVarArgs.g(2, this.pjw);
      }
      if (this.lMV != null) {
        paramVarArgs.g(3, this.lMV);
      }
      if (this.lMW != null) {
        paramVarArgs.g(4, this.lMW);
      }
      if (this.knE != null) {
        paramVarArgs.g(5, this.knE);
      }
      if (this.rfX != null) {
        paramVarArgs.g(6, this.rfX);
      }
      if (this.rfY != null) {
        paramVarArgs.g(7, this.rfY);
      }
      if (this.rfZ != null) {
        paramVarArgs.g(8, this.rfZ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rfW == null) {
        break label568;
      }
    }
    label568:
    for (int i = f.a.a.b.b.a.h(1, this.rfW) + 0;; i = 0)
    {
      paramInt = i;
      if (this.pjw != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.pjw);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lMV);
      }
      paramInt = i;
      if (this.lMW != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.lMW);
      }
      i = paramInt;
      if (this.knE != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.knE);
      }
      paramInt = i;
      if (this.rfX != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rfX);
      }
      i = paramInt;
      if (this.rfY != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rfY);
      }
      paramInt = i;
      if (this.rfZ != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rfZ);
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
        fd localfd = (fd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localfd.rfW = locala.vHC.readString();
          return 0;
        case 2: 
          localfd.pjw = locala.vHC.readString();
          return 0;
        case 3: 
          localfd.lMV = locala.vHC.readString();
          return 0;
        case 4: 
          localfd.lMW = locala.vHC.readString();
          return 0;
        case 5: 
          localfd.knE = locala.vHC.readString();
          return 0;
        case 6: 
          localfd.rfX = locala.vHC.readString();
          return 0;
        case 7: 
          localfd.rfY = locala.vHC.readString();
          return 0;
        }
        localfd.rfZ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */