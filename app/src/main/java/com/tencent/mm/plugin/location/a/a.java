package com.tencent.mm.plugin.location.a;

import f.a.a.b;
import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bk.a
{
  public LinkedList<String> bUb = new LinkedList();
  public String kCs;
  public double latitude;
  public double longitude;
  public long timestamp;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.username == null) {
        throw new b("Not all required fields were included: username");
      }
      if (this.username != null) {
        paramVarArgs.g(1, this.username);
      }
      paramVarArgs.d(2, 1, this.bUb);
      paramVarArgs.c(3, this.longitude);
      paramVarArgs.c(4, this.latitude);
      if (this.kCs != null) {
        paramVarArgs.g(5, this.kCs);
      }
      paramVarArgs.T(6, this.timestamp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.username == null) {
        break label430;
      }
    }
    label430:
    for (paramInt = f.a.a.b.b.a.h(1, this.username) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 1, this.bUb) + (f.a.a.b.b.a.ec(3) + 8) + (f.a.a.b.b.a.ec(4) + 8);
      paramInt = i;
      if (this.kCs != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.kCs);
      }
      return paramInt + f.a.a.a.S(6, this.timestamp);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.bUb.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.username != null) {
          break;
        }
        throw new b("Not all required fields were included: username");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        a locala1 = (a)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          locala1.username = locala.vHC.readString();
          return 0;
        case 2: 
          locala1.bUb.add(locala.vHC.readString());
          return 0;
        case 3: 
          locala1.longitude = locala.vHC.readDouble();
          return 0;
        case 4: 
          locala1.latitude = locala.vHC.readDouble();
          return 0;
        case 5: 
          locala1.kCs = locala.vHC.readString();
          return 0;
        }
        locala1.timestamp = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/location/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */