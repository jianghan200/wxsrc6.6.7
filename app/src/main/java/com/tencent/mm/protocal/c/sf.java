package com.tencent.mm.protocal.c;

public final class sf
  extends com.tencent.mm.bk.a
{
  public String deviceBrand;
  public String deviceModel;
  public String osName;
  public String osVersion;
  public String rvD;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.deviceModel != null) {
        paramVarArgs.g(1, this.deviceModel);
      }
      if (this.deviceBrand != null) {
        paramVarArgs.g(2, this.deviceBrand);
      }
      if (this.osName != null) {
        paramVarArgs.g(3, this.osName);
      }
      if (this.osVersion != null) {
        paramVarArgs.g(4, this.osVersion);
      }
      if (this.rvD != null) {
        paramVarArgs.g(5, this.rvD);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.deviceModel == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.deviceModel) + 0;; i = 0)
    {
      paramInt = i;
      if (this.deviceBrand != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.deviceBrand);
      }
      i = paramInt;
      if (this.osName != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.osName);
      }
      paramInt = i;
      if (this.osVersion != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.osVersion);
      }
      i = paramInt;
      if (this.rvD != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rvD);
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
        sf localsf = (sf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localsf.deviceModel = locala.vHC.readString();
          return 0;
        case 2: 
          localsf.deviceBrand = locala.vHC.readString();
          return 0;
        case 3: 
          localsf.osName = locala.vHC.readString();
          return 0;
        case 4: 
          localsf.osVersion = locala.vHC.readString();
          return 0;
        }
        localsf.rvD = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */