﻿// <auto-generated />
using System;
using HD.Wallet.Account.Service.Infrastructure;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;
using Npgsql.EntityFrameworkCore.PostgreSQL.Metadata;

#nullable disable

namespace HD.Wallet.Account.Service.Migrations
{
    [DbContext(typeof(HdWalletAccountDbContext))]
    partial class HdWalletAccountDbContextModelSnapshot : ModelSnapshot
    {
        protected override void BuildModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "7.0.14")
                .HasAnnotation("Relational:MaxIdentifierLength", 63);

            NpgsqlModelBuilderExtensions.UseIdentityByDefaultColumns(modelBuilder);

            modelBuilder.Entity("HD.Wallet.Account.Service.Infrastructure.Entities.Accounts.AccountEntity", b =>
                {
                    b.Property<string>("Id")
                        .HasColumnType("text");

                    b.Property<int>("AccountType")
                        .HasColumnType("integer");

                    b.Property<DateTime>("CreatedAt")
                        .HasColumnType("timestamp without time zone");

                    b.Property<bool>("IsBankLinking")
                        .HasColumnType("boolean");

                    b.Property<bool>("IsBlocked")
                        .HasColumnType("boolean");

                    b.Property<bool>("IsDeleted")
                        .HasColumnType("boolean");

                    b.Property<bool>("IsUnlinked")
                        .HasColumnType("boolean");

                    b.Property<DateTime>("LastUpdated")
                        .HasColumnType("timestamp without time zone");

                    b.Property<string>("LinkedAccountId")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<int>("TransactionLimit")
                        .HasColumnType("integer");

                    b.Property<string>("UserId")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<double>("WalletBalance")
                        .HasColumnType("double precision");

                    b.HasKey("Id");

                    b.HasIndex("UserId");

                    b.ToTable("Account", (string)null);
                });

            modelBuilder.Entity("HD.Wallet.Account.Service.Infrastructure.Entities.Users.UserEntity", b =>
                {
                    b.Property<string>("Id")
                        .HasColumnType("text");

                    b.Property<int>("AccountStatus")
                        .HasColumnType("integer");

                    b.Property<string>("Avatar")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("BackIdCardUrl")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<DateTime>("CreatedAt")
                        .HasColumnType("timestamp without time zone");

                    b.Property<DateTime>("DateOfBirth")
                        .HasColumnType("timestamp without time zone");

                    b.Property<DateTime>("DateOfExpiry")
                        .HasColumnType("timestamp without time zone");

                    b.Property<string>("Email")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("FaceVerificationUrl")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("FrontIdCardUrl")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("FullName")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("HashPassword")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("IdCardNo")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("IdCardType")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<bool>("IsDeleted")
                        .HasColumnType("boolean");

                    b.Property<bool>("IsEkycVerfied")
                        .HasColumnType("boolean");

                    b.Property<DateTime>("LastUpdated")
                        .HasColumnType("timestamp without time zone");

                    b.Property<string>("Nationality")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("PhoneNumber")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("PinPassword")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("PlaceOfOrigin")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<string>("PlaceOfResidence")
                        .IsRequired()
                        .HasColumnType("text");

                    b.Property<int>("Sex")
                        .HasColumnType("integer");

                    b.HasKey("Id");

                    b.ToTable("User", (string)null);
                });

            modelBuilder.Entity("HD.Wallet.Account.Service.Infrastructure.Entities.Accounts.AccountEntity", b =>
                {
                    b.HasOne("HD.Wallet.Account.Service.Infrastructure.Entities.Users.UserEntity", "User")
                        .WithMany("Accounts")
                        .HasForeignKey("UserId")
                        .OnDelete(DeleteBehavior.Cascade)
                        .IsRequired();

                    b.OwnsOne("HD.Wallet.Account.Service.Infrastructure.Entities.Accounts.AccountBankValueObject", "AccountBank", b1 =>
                        {
                            b1.Property<string>("AccountEntityId")
                                .HasColumnType("text");

                            b1.Property<string>("BankAccountId")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("BankName")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("BankOwnerName")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("IdCardNo")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.HasKey("AccountEntityId");

                            b1.ToTable("Account");

                            b1.WithOwner()
                                .HasForeignKey("AccountEntityId");
                        });

                    b.Navigation("AccountBank")
                        .IsRequired();

                    b.Navigation("User");
                });

            modelBuilder.Entity("HD.Wallet.Account.Service.Infrastructure.Entities.Users.UserEntity", b =>
                {
                    b.OwnsOne("HD.Wallet.Account.Service.Infrastructure.Entities.Users.AddressValueObject", "Address", b1 =>
                        {
                            b1.Property<string>("UserEntityId")
                                .HasColumnType("text");

                            b1.Property<string>("District")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("ProvinceOrCity")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("Street")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("WardOrCommune")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.HasKey("UserEntityId");

                            b1.ToTable("User");

                            b1.WithOwner()
                                .HasForeignKey("UserEntityId");
                        });

                    b.OwnsOne("HD.Wallet.Account.Service.Infrastructure.Entities.Users.WorkValueObject", "Work", b1 =>
                        {
                            b1.Property<string>("UserEntityId")
                                .HasColumnType("text");

                            b1.Property<string>("Occupation")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.Property<string>("Position")
                                .IsRequired()
                                .HasColumnType("text");

                            b1.HasKey("UserEntityId");

                            b1.ToTable("User");

                            b1.WithOwner()
                                .HasForeignKey("UserEntityId");
                        });

                    b.Navigation("Address")
                        .IsRequired();

                    b.Navigation("Work")
                        .IsRequired();
                });

            modelBuilder.Entity("HD.Wallet.Account.Service.Infrastructure.Entities.Users.UserEntity", b =>
                {
                    b.Navigation("Accounts");
                });
#pragma warning restore 612, 618
        }
    }
}
