package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class sd
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String detail;
  public String rvA;
  public LinkedList<String> rvz = new LinkedList();
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.desc != null) {
        paramVarArgs.g(3, this.desc);
      }
      paramVarArgs.d(4, 1, this.rvz);
      if (this.detail != null) {
        paramVarArgs.g(5, this.detail);
      }
      if (this.rvA != null) {
        paramVarArgs.g(6, this.rvA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label454;
      }
    }
    label454:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.desc);
      }
      i += f.a.a.a.c(4, 1, this.rvz);
      paramInt = i;
      if (this.detail != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.detail);
      }
      i = paramInt;
      if (this.rvA != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rvA);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rvz.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        sd localsd = (sd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localsd.title = locala.vHC.readString();
          return 0;
        case 2: 
          localsd.url = locala.vHC.readString();
          return 0;
        case 3: 
          localsd.desc = locala.vHC.readString();
          return 0;
        case 4: 
          localsd.rvz.add(locala.vHC.readString());
          return 0;
        case 5: 
          localsd.detail = locala.vHC.readString();
          return 0;
        }
        localsd.rvA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/sd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */