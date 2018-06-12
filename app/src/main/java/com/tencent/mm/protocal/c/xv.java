package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class xv
  extends com.tencent.mm.bk.a
{
  public String jPG;
  public String jPe;
  public String jPf;
  public String jQb;
  public ye rDE;
  public int rDF;
  public String rDG;
  public String rul;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.jPe == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.rul == null) {
        throw new b("Not all required fields were included: Remark");
      }
      if (this.jPG == null) {
        throw new b("Not all required fields were included: IconUrl");
      }
      if (this.rDE == null) {
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (this.jQb != null) {
        paramVarArgs.g(1, this.jQb);
      }
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      if (this.rul != null) {
        paramVarArgs.g(3, this.rul);
      }
      if (this.jPG != null) {
        paramVarArgs.g(4, this.jPG);
      }
      if (this.jPf != null) {
        paramVarArgs.g(5, this.jPf);
      }
      if (this.rDE != null)
      {
        paramVarArgs.fV(6, this.rDE.boi());
        this.rDE.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.rDF);
      if (this.rDG != null) {
        paramVarArgs.g(8, this.rDG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQb == null) {
        break label818;
      }
    }
    label818:
    for (int i = f.a.a.b.b.a.h(1, this.jQb) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPe);
      }
      i = paramInt;
      if (this.rul != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rul);
      }
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPG);
      }
      i = paramInt;
      if (this.jPf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jPf);
      }
      paramInt = i;
      if (this.rDE != null) {
        paramInt = i + f.a.a.a.fS(6, this.rDE.boi());
      }
      i = paramInt + f.a.a.a.fQ(7, this.rDF);
      paramInt = i;
      if (this.rDG != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rDG);
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
        if (this.jQb == null) {
          throw new b("Not all required fields were included: AppId");
        }
        if (this.jPe == null) {
          throw new b("Not all required fields were included: Name");
        }
        if (this.rul == null) {
          throw new b("Not all required fields were included: Remark");
        }
        if (this.jPG == null) {
          throw new b("Not all required fields were included: IconUrl");
        }
        if (this.rDE != null) {
          break;
        }
        throw new b("Not all required fields were included: DownloadInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        xv localxv = (xv)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localxv.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localxv.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localxv.rul = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localxv.jPG = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localxv.jPf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ye();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ye)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localxv.rDE = ((ye)localObject1);
            paramInt += 1;
          }
        case 7: 
          localxv.rDF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localxv.rDG = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/xv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */